package com.study.javaclass.enumstudy;

import java.util.Random;

/**
 * enum 可以实现接口，重新实现接口中的方法
 */
enum CartoonCharacter implements Generator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private Random rand = new Random(47);
    @Override
    public CartoonCharacter next(){
        int i = rand.nextInt(values().length);
        System.out.println(i);
        return values()[i];
    }
}

public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        System.out.println(rg.next() + "");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++) {
            printNext(cc);
        }
    }
}
