/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.factorydesignpattern.factorymethod;

import designpatterns.creative.factorydesignpattern.simplefactory.RuleConfig;

/**
 * @author yjl
 * @version $Id: IRuleConfigParserFactory.java, v 0.1 2021-03-10 15:34 yjl Exp $$
 */
public interface IRuleConfigParserFactory {

    RuleConfig createParser();

}