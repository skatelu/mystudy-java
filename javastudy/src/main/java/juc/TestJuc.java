package juc;

import sun.misc.Unsafe;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestJuc {

    public static void main(String[] args) {
        // 获取 CPU的核数
        // CPU密集型，IO密集型
        System.out.println(Runtime.getRuntime().availableProcessors());

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("123", "Jack");

        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>(32);

        concurrentHashMap.put("1", "3");

        Unsafe unsafe;
    }
}
