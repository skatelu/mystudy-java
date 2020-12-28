/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Component;
import testhttp.demo.sqlitetest.CommonConfigService;
import testhttp.demo.sqlitetest.config.Common;
import testhttp.demo.sqlitetest.enummodel.DataSourceIdEnum;
import testhttp.demo.sqlitetest.enummodel.ModuleEnum;

import javax.annotation.PostConstruct;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author wb-yjl790595
 * @version DataSourcePathService.java, v 0.1 2020-07-30 15:07 wb-yjl790595 Exp $$
 */
@Component
@Slf4j
@AutoConfigureAfter({CommonConfigService.class})
public class DataSourcePathService {


    @Autowired
    CommonConfigService commonConfigService;

    public String dataSourceVersion = "";

    @Getter
    @Setter
    private String baseLineVersion = "";

    public String dataSourceAbsolutePath = "";

    @PostConstruct
    public void initialVersionRealPath() {
        String commonDataSourcePath = commonConfigService.getDbPath(ModuleEnum.BASE_DATA);
        if (!commonDataSourcePath.endsWith(Common.FILE_PATH_SEPERATER) || !commonDataSourcePath.endsWith("\\")) {
            commonDataSourcePath = commonDataSourcePath + Common.FILE_PATH_SEPERATER;
        }

        // 查找上次启动的数据源
//        String selectSql = "select data_pack_id as dataPackId,tenant_id as tenantId,brand_id as brandId,store_id as storeId," +
//                "main_version as mainVersion,file_path as filePath from data_down_record where enable_status=3";
//        DataDownRecordDO dataDownRecordDO = selectOne(
//                commonDataSourcePath + DataSourceIdEnum.RECORD_DATASOURCE.getCode() + Common.DB_FILE_SUFFIX,
//                selectSql,
//                DataDownRecordDO.class);
//        if (dataDownRecordDO != null && StringUtils.isNotBlank(dataDownRecordDO.getMainVersion())) {
//            String mainVersion = dataDownRecordDO.getMainVersion();
//            if(mainVersion.contains(Common.UNDER_LINE_MARK)){
//                dataSourceVersion = mainVersion.substring(0,mainVersion.indexOf(Common.UNDER_LINE_MARK));
//                baseLineVersion = mainVersion.substring(mainVersion.indexOf(Common.UNDER_LINE_MARK)+1);
//            }else {
//                dataSourceVersion = mainVersion;
//            }
//        }
        dataSourceAbsolutePath = commonDataSourcePath;

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
     * 获取当前数据源版本号
     *
     * @return
     */
    public String getCurrentDataSourceVersion() {
        return dataSourceVersion;
    }

    /**
     * 设置当前数据源版本号
     *
     * @param currentDataSourceVersion
     * @return
     */
    public void setCurrentDataSourceVersion(String currentDataSourceVersion) {
        dataSourceVersion = currentDataSourceVersion;
    }

    /**
     * 获取数据源父路径  示例common包里的路径 + "/"
     *
     * @return
     */
    public String getDataSourceParentPath() {
        return dataSourceAbsolutePath;
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

}