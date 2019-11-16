package com.study.javaclass.polymorphism;

/**
 * 1.1、忘记对象类型
 */
public class Brass extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play()" + note);
    }
}
