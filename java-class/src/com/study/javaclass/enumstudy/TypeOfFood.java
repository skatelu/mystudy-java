package com.study.javaclass.enumstudy;

import static com.study.javaclass.enumstudy.Food.*;
public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
    }
}
