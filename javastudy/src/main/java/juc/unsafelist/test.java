package juc.unsafelist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {

    public static void main(String[] args) {
        // 并发下 ArrayList 不安全
        // java.util.ConcurrentModificationException  并发修改异常
//        List list = new ArrayList();

        // 写入时复制 CopyOnWrite  COW 计算机程序设计领域一种优化策略
        // 在写入的时候避免覆盖，造成数据问题！
        // CopyOnWriteArrayList 比 Vector 效率高
        // 使用的是LOCK锁  Vector 使用的是 synchronized 锁
        List<String> list = new CopyOnWriteArrayList();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(list);
            }).start();
        }
    }

}
