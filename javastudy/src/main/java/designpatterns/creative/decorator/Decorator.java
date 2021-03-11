/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designpatterns.creative.decorator;

/**
 * @author yjl
 * @version $Id: Decorator.java, v 0.1 2020-12-31 16:48 yjl Exp $$
 */
public class Decorator implements Component {

    // 持有一个 Component 类型的对象引用
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void function() {
        component.function(); // 客户端的调用委派给具体的子类
    }
}