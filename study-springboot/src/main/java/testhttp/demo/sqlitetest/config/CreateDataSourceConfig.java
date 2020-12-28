/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.config;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import testhttp.demo.sqlitetest.enummodel.DataSourceIdEnum;

/**
 * @author wb-yjl790595
 * @version CreateDBConfig.java, v 0.1 2020-07-30 21:06 wb-yjl790595 Exp $$
 * @Document 获取sqlite数据源及动态创建mybatis数据源
 */
@Component
@Slf4j
public class CreateDataSourceConfig {

    private String dataSource = "";
//
//    @Autowired
////    Test1 test1;
//
//    @Autowired
//    CommonConfigService commonConfigService;

    public String dataSourceVersion = "";

    @Getter
    @Setter
    private String baseLineVersion = "";

    public String dataSourceAbsolutePath = "";


    /**
     * 初始化DB文件路径
     */
    @PostConstruct
    private void initialVersionRealPath() {

//        String commonDataSourcePath = commonConfigService.getDbPath(ModuleEnum.BASE_DATA);
//        if (!commonDataSourcePath.endsWith(Common.FILE_PATH_SEPERATER) || !commonDataSourcePath.endsWith("\\")) {
//            commonDataSourcePath = commonDataSourcePath + Common.FILE_PATH_SEPERATER;
//        }
//
//        // 若元数据不存在，创建DB文件
//
//        // 查找上次启动的数据源
//        String selectSql = "select data_pack_id as dataPackId,tenant_id as tenantId,brand_id as brandId,store_id as storeId," +
//                "main_version as mainVersion,file_path as filePath from test1 where enable_status=3";
//        TestModel testModel = selectOne(
//                commonDataSourcePath + DataSourceIdEnum.RECORD_DATASOURCE.getCode() + Common.DB_FILE_SUFFIX,
//                selectSql,
//                TestModel.class);
//        if (testModel != null && StringUtils.isNotBlank(testModel.getMainVersion())) {
//            String mainVersion = testModel.getMainVersion();
//            if(mainVersion.contains(Common.UNDER_LINE_MARK)){
//                dataSourceVersion = mainVersion.substring(0,mainVersion.indexOf(Common.UNDER_LINE_MARK));
//                baseLineVersion = mainVersion.substring(mainVersion.indexOf(Common.UNDER_LINE_MARK)+1);
//            }else {
//                dataSourceVersion = mainVersion;
//            }
//        }
    }


    /**
     * 根据数据源ID获取数据源绝对路径
     *
     * @param dataSourceIdEnum
     * @return
     */
    public String getDataSourceAbsolutePath(DataSourceIdEnum dataSourceIdEnum) {
//        AssertUtil.isNotNull(dataSourceIdEnum, "获取数据源路径，数据源Id不能为空");
        if (dataSourceIdEnum == DataSourceIdEnum.RECORD_DATASOURCE) {
            return dataSourceAbsolutePath + DataSourceIdEnum.RECORD_DATASOURCE.getCode() + Common.DB_FILE_SUFFIX;
        } else {
            return dataSourceAbsolutePath + dataSourceVersion + (StringUtils.isNotBlank(baseLineVersion)?Common.FILE_PATH_SEPERATER+baseLineVersion:"") + Common.FILE_PATH_SEPERATER +
                    dataSourceIdEnum.getCode() + Common.DB_FILE_SUFFIX;
        }
    }

    /**
     * 功能描述: 启动的时候查找上次使用的版本号
     *
     * @Author: xingzhe
     * @Date 2020/4/15
     */
    private <T> T selectOne(String dbFileAbsolutePath, String selectSql, Class clazz) {
        if (!new File(dbFileAbsolutePath).exists()) {
            return null;
        }
        QueryRunner queryRunner = new QueryRunner();
        Connection conn = null;
        try {
            conn = getConnection(dbFileAbsolutePath);
            return (T)queryRunner.query(conn, selectSql, new BeanHandler<>(clazz));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                log.error(e.getMessage(), e);
            }
        }
        return null;
    }

    /**
     * 功能描述: 获取数据源连接
     *
     * @Author: xingzhe
     * @Date 2020/4/15
     */
    private Connection getConnection(String dbFilePath) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbFilePath);
        return conn;
    }

    /**
     * 若不存在db文件，进行创建
     */
    private void createDBfile(String dataSourcePath) {

        File file = new File(dataSourcePath);

        //  如果该文件不存在，进行创建
        if (!file.exists()) {
//            FileUtils.
        }
    }

}