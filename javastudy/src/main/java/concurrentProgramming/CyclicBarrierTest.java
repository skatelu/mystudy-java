/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @author yjl
 * @version $Id: CyclicBarrierTest.java, v 0.1 2021-01-29 16:23 yjl Exp $$
 */
public class CyclicBarrierTest {

    public static void main(String[] args) throws InterruptedException {
        //CyclicBarrierOneParam();
        CyclicBarrierTwoParam();
    }


    private static void CyclicBarrierOneParam(){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(4);
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(1);
        }).start();

        new Thread(()->{
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(2);
        }).start();

        System.out.println(3);
    }

    /**
     * CyclicBarrier还提供一个更高级的构造函数CyclicBarrier（int parties，Runnable barrierAction），
     * 用于在线程到达屏障时，优先执行barrierAction，方便处理更复杂的业务场景
     * @return
     * @throws
     * @author yjl
     * @create 2021-01-29 17:9:51
     * @since v0.1
     */
    private static void CyclicBarrierTwoParam() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, () -> {
            System.out.println(3);
        });
        new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(2);
        }).start();

        try{
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        } finally {

        }

    }
}