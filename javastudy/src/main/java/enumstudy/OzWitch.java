package enumstudy;

/**
 * 注意 枚举类的构造方法 即使不声明为private ，我们只能在enum定义的内部使用其构造器来创建enum实例
 * 一旦enum的定义结束，编译器就不允许我们再使用其构造器来创建任何实例了
 */
public enum OzWitch {
    WEST("this is WEST"),
    NORTH("this is NORTH"),
    EAST("this is EAST"),
    SOUTH("this is SOUTH");

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + "" + witch.getDescription());
        }
    }
}
