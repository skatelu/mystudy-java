package com.study.javaclass.jvm_lecture.jvm.classloader;

/**
 *  final 常量在编译阶段，会存入到调用这个常量的方法所在的类的常量池中，
 * 本质上，调用类并没有直接引用到定义常量的类，因此并不会触发
 * 定义常量的类的初始化
 * 注意：这里指的是将常量存放到了MyTest2的常量池中，之后MyTest2 与 MyParent2 就没有任何关系了
 * 甚至，我们可以将MyParent2的class文件删除
 */

/**
 * 助记符   通过反编译.class 文件  命令：javap -C
 * ldc 表示将int,float或是String 类型的常量值从常量池中推送至栈顶
 * bipush 表示将单字节（-128，127） 的常量值推送至栈顶
 * sipush 表示将一个短整型常量值（-32768，32767）推送至栈顶
 * iconst_1表示将int类型的1 推送至栈顶，（iconst_1，iconst_）
 * 栈顶 表示程序接下来就要使用的
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.str);
    }
}

/**
 * 在编译阶段 就会加载到
 */
class MyParent2{
    public static final String str = "hello World";
    static {
        System.out.println("MyParent2 static block");
    }
}

