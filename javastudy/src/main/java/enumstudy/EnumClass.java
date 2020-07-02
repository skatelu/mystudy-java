package enumstudy;

/**
 * enum 常用的方法  enum类都继承Enum类
 */
enum Shrubbery {
    GROUND, CRAWLING, HANGING,
}

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s + "ordinal:" + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING) + "");
            System.out.println(s.equals(Shrubbery.CRAWLING) + "");
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("-------------------------");
        }

        // valueOf 是在Enum中定义的static方法，它根据给定的名字返回相应的 enum实例
        for (String s : "GROUND CRAWLING HANGING".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrubbery);
        }
    }
}
