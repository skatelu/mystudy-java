package juc.single;

/**
 * 饿汉式   单例模式：构造器私有
 */
public class Hungry {

    private Hungry() {

    }

    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }
}
