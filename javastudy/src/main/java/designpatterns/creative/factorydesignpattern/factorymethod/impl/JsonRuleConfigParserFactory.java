/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.factorydesignpattern.factorymethod.impl;

import designpatterns.creative.factorydesignpattern.factorymethod.IRuleConfigParserFactory;
import designpatterns.creative.factorydesignpattern.simplefactory.RuleConfig;
import designpatterns.creative.factorydesignpattern.simplefactory.impl.JsonRuleConfigParser;

/**
 * @author yjl
 * @version $Id: JsonRuleConfigParserFactory.java, v 0.1 2021-03-10 16:07 yjl Exp $$
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public RuleConfig createParser() {
        return new JsonRuleConfigParser();
    }

}