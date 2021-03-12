/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.factorydesignpattern.factorymethod;

import designpatterns.creative.factorydesignpattern.factorymethod.impl.JsonRuleConfigParserFactory;
import designpatterns.creative.factorydesignpattern.factorymethod.impl.PropertiesRuleConfigParserFactory;
import designpatterns.creative.factorydesignpattern.factorymethod.impl.XmlRuleConfigParserFactory;
import designpatterns.creative.factorydesignpattern.factorymethod.impl.YamlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂的工厂
 * 我们可以为工厂类再创建一个简单工厂，也就是工厂的工厂，用来创建工厂类对象
 * @author yjl
 * @version $Id: RuleConfigParserFactoryMap.java, v 0.1 2021-03-10 16:11 yjl Exp $$
 */
public class RuleConfigParserFactoryMap {

    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        IRuleConfigParserFactory IRuleConfigParserFactory = cachedFactories.get(type.toLowerCase());
        return IRuleConfigParserFactory;
    }

}