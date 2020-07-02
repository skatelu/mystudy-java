package juc.single;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/**
 * 懒汉式：单例模式
 * 单例模式 必须会手写
 */
public class LazyMan {

    // 但是这种模式在反射状态下会破环单例
    private LazyMan(){
        synchronized (LazyMan.class){
            if (LAZYMAN != null) {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
    }

    private static volatile LazyMan LAZYMAN;
    public static LazyMan getInstance(){
        // 加锁之前可能被两个线程拿到，所以需要 双重检索 DCL 懒汉式
        if(LAZYMAN == null){
            synchronized (LazyMan.class){
                if(LAZYMAN == null){
                    LAZYMAN = new LazyMan();
                }
            }
        }

        return LAZYMAN;
    }

    // 单线程下并发OK
    public static void main(String[] args) throws Exception {
        // 反射模式会破环单例
        LazyMan instance = LazyMan.getInstance();

        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        LazyMan lazyMan = declaredConstructor.newInstance();

        System.out.println(instance);
        System.out.println(lazyMan);
    }
}
