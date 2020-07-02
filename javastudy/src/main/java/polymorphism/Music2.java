package polymorphism;

/**
 *1.1 忘记类型
 * 如果 tune 中的参数直接是乐器类的时候，那么每当我们创建一个新的乐器类的时候
 * 就得重新添加一个tune方法
 */
public class Music2 {

    public static void tune(Instrument wind) {
        wind.play(Note.MIDDLE_C);
    }
//    public static void tune(Wind wind) {
//        wind.play(Note.MIDDLE_C);
//    }
//    public static void tune(Stringed wind) {
//        wind.play(Note.MIDDLE_C);
//    }
//    public static void tune(Brass wind) {
//        wind.play(Note.MIDDLE_C);
//    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        Stringed stringed = new Stringed();
        Brass brass = new Brass();
        tune(wind);
        tune(stringed);
        tune(brass);

    }
}
