package juc;

/**
 * 买票的例子
 * 线程就是一个单独的资源类，没有任何附属操作！
 */
public class SaleTicketDemo1 {
    // 并发，多线程操作同一个资源类,把资源类丢入线程中
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
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
 */
class Ticket{
    private int number = 50;
    //买票的方法
    // synchronized 本质：队列，锁
    public synchronized void sale(){
        if(number>0){
            System.out.println(Thread.currentThread().getName()+"卖出了"+(number--)+"张票,剩余"+number);
        }
    }
}