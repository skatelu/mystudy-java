/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designpatterns.creative.decorator;

/**
 * @author yjl
 * @version $Id: ConcreteComponent.java, v 0.1 2020-12-31 16:47 yjl Exp $$
 */
public class ConcreteComponent implements Component {

    @Override
    public void function() {
        System.out.println("基本功能：呼吸+觅食+睡觉。。");
    }
}