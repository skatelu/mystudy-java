/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.factorydesignpattern.factorymethod.impl;

import designpatterns.creative.factorydesignpattern.factorymethod.IRuleConfigParserFactory;
import designpatterns.creative.factorydesignpattern.simplefactory.RuleConfig;
import designpatterns.creative.factorydesignpattern.simplefactory.impl.PropertiesRuleConfigParser;

/**
 * @author yjl
 * @version $Id: PropertiesRuleConfigParserFactory.java, v 0.1 2021-03-10 16:09 yjl Exp $$
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public RuleConfig createParser() {
        return new PropertiesRuleConfigParser();
    }

}