/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * @author wb-yjl790595
 * @version Test.java, v 0.1 2020-10-19 18:50 wb-yjl790595 Exp $$
 */
public class Test {
    public static void main(String[] args) {



    }

    private String checkParams(baseA baseA) {
        baseB baseB1 = (baseB)baseA;

        String result = getResult(baseB1);
        return result;
    }

    private String getResult(BaseC baseC) {
        System.out.println("this is C");
        return "C";
    }

    private String getResult(BaseD baseD) {
        System.out.println("this is D");
        return "D";
    }

}