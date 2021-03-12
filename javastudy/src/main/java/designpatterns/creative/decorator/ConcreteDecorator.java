/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designpatterns.creative.decorator;

/**
 * @author yjl
 * @version $Id: ConcreteDecorator.java, v 0.1 2020-12-31 17:11 yjl Exp $$
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void function() {
        super.function();
        System.out.println("附加功能：");
        eat();
        bellow();
    }

    private void eat(){
        System.out.println("吃肉");
    }

    private void bellow() {
        System.out.println("吼叫");
    }
}