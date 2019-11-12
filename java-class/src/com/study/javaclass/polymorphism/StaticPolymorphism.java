package com.study.javaclass.polymorphism;

class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {

    @Override
    public String dynamicGet() {
        return super.dynamicGet();
    }
}

public class StaticPolymorphism {

}
