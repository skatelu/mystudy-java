/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.config;

import java.math.BigDecimal;

/**
 * @author wb-yjl790595
 * @version Common.java, v 0.1 2020-07-30 16:27 wb-yjl790595 Exp $$
 */

public class Common {
    public static final String SCHEME_ID_PLACE_HOLDER = "#{#schemeId}";
    public static final String SCHEME_MODULE_ID_PLACE_HOLDER = "#{#schemeModule}";
    public static final String DB_FILE_SUFFIX = ".db";
    public static final String DB_URL_PREFIX = "jdbc:sqlite:";
    public static final String FILE_PATH_SEPERATER = "/";
    public static final String SAVE_AS_SQLITE_FORMAT = "sqlite";
    public static final String SAVE_AS_JSON_FORMAT = "json";
    public static final String CHOICE_FILE_NAME = "choice.xml";
    public static final String SPLIT = ",";
    public static final String HANG = "-";
    public static final String UNDER_LINE_MARK = "_";
    public static final String TENANT_DB_NAME = "tenantDimension";
    public static final String ACTIVITY_DB_NAME = "activityDimension";
    public static final String SCENE_DB_NAME = "sceneDimension";
    public static final String STORE_DB_NAME = "storeDimension";
    public static final String STORE_PRINT_NAME = "storePrintDimension";
    public static final String ACTIVITY_DATA_SOURCE = "activityDataSource";
    public static final String ACTIVITY_SESSION_FACTORY = "activitySessionFactory";
    public static final String ACTIVITY_SESSION_FACTORY_TEMPLATE = "activitySqlSessionTemplate";
    public static final String ACTIVITY_DATASOURCE_PROPERTIES = "activityDataSourceProperties";
    public static final String TENANT_DATA_SOURCE = "tenantDataSource";
    public static final String TENANT_SESSION_FACTORY = "tenantSessionFactory";
    public static final String TENANT_SESSION_FACTORY_TEMPLATE = "tenantSqlSessionTemplate";
    public static final String TENANT_DATASOURCE_PROPERTIES = "tenantDataSourceProperties";
    public static final String SCENE_DATA_SOURCE = "sceneDataSource";
    public static final String SCENE_SESSION_FACTORY = "sceneSessionFactory";
    public static final String SCENE_SESSION_FACTORY_TEMPLATE = "sceneSqlSessionTemplate";
    public static final String SCENE_DATASOURCE_PROPERTIES = "sceneDataSourceProperties";
    public static final String STORE_DATA_SOURCE = "storeDataSource";
    public static final String STORE_SESSION_FACTORY = "storeSessionFactory";
    public static final String STORE_SESSION_FACTORY_TEMPLATE = "storeSqlSessionTemplate";
    public static final String STORE_DATASOURCE_PROPERTIES = "storeDataSourceProperties";
    public static final String BASIC_DATA_SOURCE = "recordDataSource";
    public static final String BASIC_SESSION_FACTORY = "recordSessionFactory";
    public static final String BASIC_SESSION_FACTORY_TEMPLATE = "recordSqlSessionTemplate";
    public static final String BASIC_DATASOURCE_PROPERTIES = "recordDataSourceProperties";
    public static final BigDecimal HUNDRED = BigDecimal.valueOf(100L);
    public static final BigDecimal FIRST_DECIMAL = BigDecimal.valueOf(0.1D);
    public static final BigDecimal SECOND_DECIMAL = BigDecimal.valueOf(0.01D);
    public static final String WHETHER_Y = "Y";
    public static final String WHETHER_N = "N";
    public static final char QUESTION_MARK = '?';
    public static final Integer ONE = 1;
    public static final String CUSTOMER = "CUSTOMER";
    public static final String CASHIER = "CASHIER";
    public static final String BASE_LINE = "baseLine";

    public Common() {
    }
}