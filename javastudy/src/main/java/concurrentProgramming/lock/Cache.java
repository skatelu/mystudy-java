/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Java 并发编程 读写锁 使用案例
 *  Cache组合一个非线程安全的HashMap作为缓存的实现，同时使用读写锁的读锁和写锁来保证Cache是线程安全的
 * @author yjl
 * @version $Id: Cache.java, v 0.1 2021-01-27 11:01 yjl Exp $$
 */
public class Cache {

    static Map<String, Object> map = new HashMap<>();
    static ReadWriteLock rwl = new ReentrantReadWriteLock();
    static Lock readLock = rwl.readLock();
    static Lock writeLock = rwl.writeLock();

    /**
     * 根据key 获取对应的 value
     *
     * @param key
     * @return
     */
    public static final Object get(String key) {
        LockSupport.park();
        // 锁一定在try块之外
        readLock.lock();
        try {
            return map.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public static final Object put(String key, Object value) {
        writeLock.lock();
        try{
            return map.put(key, value);
        }finally {
            writeLock.unlock();
        }
    }

    public static final void clear(){
        writeLock.lock();
        try{
            map.clear();
        }finally {
            writeLock.unlock();
        }
    }

}