package juc;

/**
 * 生产者消费者模式
 * 解决  线程之间的通信问题：生产者和消费者问题！  等待唤醒，通知唤醒
 * 线程交替执行  A  B  操作同一个变量  num = 0
 * A num+1
 * B num-1
 * 需要使用while判断 防止虚假唤醒  jdk1.8 API中指出 使用while 会取判断线程是否需要等待问题
 */
public class productconsumer {

    public static void main(String[] args) {

        Data data = new Data();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.dscrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.dscrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"D").start();
    }

}

/**
 * 判断等待，业务，通知
 */
class Data{
    private int number = 0;

    /**
     * +1
     */
    public synchronized void increment() throws InterruptedException {
        while (number != 0) {
            // 等待
            this.wait();
        }
        number++;
        // 通知其他线程，我 +1 完毕了
        System.out.println(Thread.currentThread().getName()+"=>"+number);
        this.notifyAll();
    }

    /**
     * -1
     */
    public synchronized void dscrement() throws InterruptedException {
        while (number == 0){
            // 等待
            this.wait();
        }
        number--;
        // 通知其他线程，我-1完毕了
        System.out.println(Thread.currentThread().getName()+"=>"+number);
        this.notifyAll();
    }
}