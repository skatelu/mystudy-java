/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.singledesignpattern;

/**
 * 进程间唯一单例，即集群间的唯一单例
 * @author yjl
 * @version $Id: IDGenerator4.java, v 0.1 2021-03-02 11:07 yjl Exp $$
 */
//public class IDGenerator4 {
//
//    private AtomicLong id = new AtomicLong(0);
//    private static IdGenerator instance;
//    private static SharedObjectStorage storage = FileSharedObjectStorage(/*入参省略，比如文件地址*/);
//    private static DistributedLock lock = new DistributedLock();
//    private IDGenerator4() {}
//    public synchronized static IdGenerator getInstance(){
//        if (instance == null) {
//            lock.lock(); instance = storage.load(IdGenerator.class);
//        }
//        return instance;
//    }
//    public synchroinzed void freeInstance() {
//        storage.save(this, IdGeneator.class);
//        instance = null; //释放对象
//        lock.unlock();
//    }
//    public long getId() {
//        return id.incrementAndGet();
//    }
//}
//// IdGenerator使用举例
//IdGenerator idGeneator = IdGenerator.getInstance();
//long id = idGenerator.getId();
//IdGenerator.freeInstance();
