/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.builder;

import org.apache.commons.lang3.StringUtils;

/**
 * Product
 * 产品（房子）
 * @author yjl
 * @version $Id: Product.java, v 0.1 2021-03-11 13:45 yjl Exp $$
 */
public class Product {
    private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    @Override
    public String toString() {
        return (StringUtils.isBlank(buildA) ? "" : buildA) +
            (StringUtils.isBlank(buildB) ? "" : "\n" + buildB) +
            (StringUtils.isBlank(buildC) ? "" : "\n" + buildC) +
            (StringUtils.isBlank(buildD) ? "" : "\n" + buildD) +
            "\n" + "房子验收完成";
    }

}