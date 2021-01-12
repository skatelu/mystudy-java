/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

/**
 * 4.1.1  使用JMX来查看一个普通的java程序包含哪些线程
 * @author yjl
 * @version $Id: MultiThread.java, v 0.1 2021-01-12 12:26 yjl Exp $$
 */
public class MultiThread {

    public static void main(String[] args) {
        // 获取java线程管理者MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        Arrays.stream(threadInfos).forEach(threadInfo -> {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.
                getThreadName());
        });
    }

}