package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock + Condition 进行 精准的通知和唤醒线程
 */
public class productconsumer3 {

    public static void main(String[] args) {
        Data3 data3 = new Data3();
        // 按顺序执行  A->B->C
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data3.printA();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data3.printB();
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data3.printC();
            }
        },"C").start();

//        new Thread(()->data3.printA(),"A").start();
//        new Thread(()->data3.printB(),"B").start();
//        new Thread(()->data3.printC(),"C").start();
    }
}

class Data3{
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    private int number = 1;// 1A,2B,3C

    public void printA(){
        lock.lock();
        try {
            while (number != 1) {
                condition.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>AAAAA");
            Thread.sleep(1000);
            // 唤醒指定的线程
            number = 2;
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void printB(){
        lock.lock();
        try {
            while (number != 2) {
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>BBBBBB");
            Thread.sleep(1000);
            number = 3;
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printC(){
        lock.lock();
        try {
            while (number != 3) {
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>CCCCCC");
            Thread.sleep(1000);
            number = 1;
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}