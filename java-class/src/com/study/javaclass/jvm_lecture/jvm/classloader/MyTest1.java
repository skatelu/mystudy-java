package com.study.javaclass.jvm_lecture.jvm.classloader;

/**
 * jvm中主动使用与被动使用的关联关系
 * 这种状态下 在运行的时候 MyChild1中的static静态代码块并没有去执行 即打印结果如下
 *      MyParent1 static block
 *      Hello world
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化
 * 在这个类中 子类调用的是父类的静态属性  这种情况称为 对MyParent1的主动使用  但并没有对 MyChild1进行主动使用  故并没有对MyChild1进行初始化
 * 不对MyChild1进行初始化，静态代码块就不会进行执行
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
    }
}

class MyParent1{
    public static String str = "Hello world";
    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1 {
    static {
        System.out.println("MyChild1 static block");
    }
}