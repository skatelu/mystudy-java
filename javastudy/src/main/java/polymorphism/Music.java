package polymorphism;

/**
 * 1、多态--向上转型
 *  目前 tune 方法中需要的是一个 Instrument 类 但我们实际传递的是 Instrument 的子类 Wind类
 *  此处：参数传递的时候 Wind自动向上转型成 Instrument 类
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
