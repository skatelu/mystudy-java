package com.study.javaclass.finaldemo;

/**
 * final 参数
 * 方法f() 和 g() 展示了当基本类型的参数被指明为final时所出现的结果：你可以读取参数，但却无法改变参数
 * 这一特性主要用来向匿名内部类传递数据
 */
class Gizmo{
    public void spin(){}
}
public class FinalArguments {
    void with(final Gizmo gizmo) {
//        gizmo = new Gizmo();  //Illegal -- g is final
    }
    void without(Gizmo gizmo){
        gizmo = new Gizmo();
        gizmo.spin();
    }

//    void f(final int i){i++;}// Can't change You can only read from a final primitive
    int g(final int i){return i + 1;}

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
