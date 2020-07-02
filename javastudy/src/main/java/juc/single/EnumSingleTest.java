package juc.single;

/**
 * 枚举类型的单例模式
 */
public class EnumSingleTest {
    // 首先需要一个无参的构造方法
    private EnumSingleTest(){

    }

    private enum SingleInstance{
        INSTANCE;
        private final EnumSingleTest enumSingleTest;

        SingleInstance() {
            enumSingleTest = new EnumSingleTest();
        }

        private EnumSingleTest getInstance(){
            return enumSingleTest;
        }


    }

    private static EnumSingleTest getInstance(){
        return SingleInstance.INSTANCE.getInstance();
    }
}
