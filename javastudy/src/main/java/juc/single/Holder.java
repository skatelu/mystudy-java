package juc.single;

/**
 * 内部静态类的 单例模式
 */
public class Holder {

    private Holder(){

    }

    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }

    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }

}
