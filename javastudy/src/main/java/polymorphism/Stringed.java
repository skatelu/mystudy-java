package polymorphism;

/**
 * 1.1、忘记对象类型
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }
}
