/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package java8;

import javafx.util.Pair;

import java.util.Optional;

import org.apache.commons.lang3.ObjectUtils.Null;

/**
 * @author yjl
 * @version $Id: optionalTest.java, v 0.1 2021-03-02 14:56 yjl Exp $$
 */
public class optionalTest {

    public static void main(String[] args) {

        Optional<Object> empty = Optional.empty();

        Optional<String> optString = Optional.of("123");

        Insurance insurance = new Insurance();

        Optional<Insurance> optNull = Optional.ofNullable(insurance);

        optNull.isPresent();

        String name = optNull.map(Insurance::getName).orElse("Unknown");
        System.out.println(name);
    }

}