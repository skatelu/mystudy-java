/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.factorydesignpattern.simplefactory;

import designpatterns.creative.factorydesignpattern.simplefactory.impl.JsonRuleConfigParser;
import designpatterns.creative.factorydesignpattern.simplefactory.impl.PropertiesRuleConfigParser;
import designpatterns.creative.factorydesignpattern.simplefactory.impl.XmlRuleConfigParser;
import designpatterns.creative.factorydesignpattern.simplefactory.impl.YamlRuleConfigParser;

/**
 * 简单工厂模式
 * @author yjl
 * @version $Id: SimpleFactory.java, v 0.1 2021-03-10 14:51 yjl Exp $$
 */
public class RuleConfigParserFactory {

    public static RuleConfig createParser(String configFormat) {
        RuleConfig parser = null;

        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }

}