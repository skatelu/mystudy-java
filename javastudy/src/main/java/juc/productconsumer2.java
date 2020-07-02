package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 次出使用的是 Lock 来实现生产者 消费者模式
 */
public class productconsumer2 {

    public static void main(String[] args) {

        Data2 data = new Data2();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                    data.increment();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                    data.decrement();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                    data.increment();
            }
        },"C").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                    data.decrement();
            }
        },"D").start();

    }
}

/**
 * 生产者消费者模式流程  判断等待、业务、通知唤醒
 */
class Data2{
    private int number = 0;
    private boolean flag = false;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
//        condition.await(); 等待
//        condition.signalAll();  唤醒全部

    public void increment(){
        lock.lock();

        try {
            while(flag){
                //等待
                condition.await();
            }
            // 业务
            number++;
            System.out.println(Thread.currentThread().getName()+"=>"+number);
            // 通知唤醒
            condition.signalAll();
            flag = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            while (!flag){
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName()+"=>"+number);
            // 通知唤醒
            condition.signalAll();
            flag = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}