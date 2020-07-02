package juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo02 {

    // 并发，多线程操作同一个资源类,把资源类丢入线程中
    public static void main(String[] args) {
        Ticket02 ticket = new Ticket02();
        // @FunctionalInterface 函数式接口 接口可以new，JDK1.8 lambda表达式 ()->{}
        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"C").start();
    }
}

/**
 * 资源类
 * Lock三部曲
 * 1、首先在业务代码之外 创建LOCK锁，即new ReentrantLock()
 * 2、Lock.locl  加锁
 * 3、finally 中 lock.unlock  解锁
 */
class Ticket02{
    private int number = 50;
    //LOCK 锁
    Lock lock = new ReentrantLock();
    public void sale(){

        lock.lock();// 加锁
        lock.tryLock();
        try {
            // 业务代码
            if(number>0){
                System.out.println(Thread.currentThread().getName()+"卖出了"+(number--)+"张票,剩余"+number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
