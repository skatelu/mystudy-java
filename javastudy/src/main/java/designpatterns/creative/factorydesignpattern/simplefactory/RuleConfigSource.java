/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.factorydesignpattern.simplefactory;

/**
 * @author yjl
 * @version $Id: RuleConfigSource.java, v 0.1 2021-03-10 14:53 yjl Exp $$
 */
public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) {

        RuleConfig parser = RuleConfigParserFactory.createParser(ruleConfigFilePath);
        if (parser == null) {
            throw new RuntimeException( "Rule config file format is not supported: " + ruleConfigFilePath);
        }
        // 创建出来后，此处可进行其它操作，此处省略，暂时不写
        return parser;
    }
}