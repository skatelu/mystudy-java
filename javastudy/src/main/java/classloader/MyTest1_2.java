package classloader;

/**
 * jvm中主动使用与被动使用的关联关系
 * 运行结果如下：
 *      MyParent1 static block
 *      MyChild1 static block
 *      welcome
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化
 * 在这个类中 子类调用的是子类的静态属性  这种情况称为 对MyParent1_2，MyChild1_2的主动使用  MyChild1_2会进行初始化
 * MyChild1进行初始化，静态代码块就会进行执行
 * 当一个类在初始化时，要求其父类全部都已经初始化完毕了
 * -XX:+TraceClassLoading,用于追踪类的加载信息并打印出来
 */
public class MyTest1_2 {
    public static void main(String[] args) {
        System.out.println(MyChild1_2.str2);
    }
}

class MyParent1_2{
    public static String str = "Hello world";
    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1_2 extends MyParent1_2 {
    public static String str2 = "welcome";
    static {
        System.out.println("MyChild1 static block");
    }
}