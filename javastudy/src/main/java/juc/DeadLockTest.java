package juc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 手写代码类
 */
public class DeadLockTest {

    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        while(true){
            new Thread(()->{
                demo.production();
            }).start();
//            TimeUnit.SECONDS.sleep(3);
            new Thread(()->{
                demo.consumer();
            }).start();
        }
    }

}

class Demo {
    public volatile int a = 0;
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void production(){
        lock.lock();
        try {
            while (a == 1) {
                condition.await();
            }
            a++;
            System.out.println("我已对 a 进行加法处理了: " + a);
            // 唤醒B线程
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consumer(){
        lock.lock();
        try {
            while(a == 0){
                condition.await();
            }
            a--;
            System.out.println("我已对 a 进行减法处理了:===================== " + a);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}