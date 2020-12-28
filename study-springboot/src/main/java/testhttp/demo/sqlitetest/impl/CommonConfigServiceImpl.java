/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import testhttp.demo.sqlitetest.CloudConfig;
import testhttp.demo.sqlitetest.CommonConfigService;
import testhttp.demo.sqlitetest.config.GwInfoConfig;
import testhttp.demo.sqlitetest.config.IPickConfig;
import testhttp.demo.sqlitetest.enummodel.ConfigKeyEnum;
import testhttp.demo.sqlitetest.enummodel.ModuleEnum;
import testhttp.demo.sqlitetest.enummodel.ProductNameEnum;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb-yjl790595
 * @version CommonConfigServiceImpl.java, v 0.1 2020-07-30 16:04 wb-yjl790595 Exp $$
 */
@Service
@Slf4j
public class CommonConfigServiceImpl implements CommonConfigService {
    @Autowired
    @Lazy(true)
    private IPickConfig iPickConfig;

    @Autowired
    @Lazy(true)
    private GwInfoConfig gwInfoConfig;

    private Map<ModuleEnum, String> dbPath;

    private boolean isMac;

    private final Map<String, String> configMap = new HashMap<>();

    private CloudConfig cloudConfig;

    @Value("${product.test.env:prod}")
    private String env;

    @PostConstruct
    private void init(){
        this.initDpPath();
    }

    @Override
    public String getDbPath(ModuleEnum model){
        switch(model){
            case BASE_DATA:
            case DISH:
            case ORDER:
                return dbPath.get(model);
            default:
                return dbPath.get(ModuleEnum.ORDER);
        }
    }

    @Override
    public void refreshShopInfo(){
        this.initShopConfig();

        this.initGwInfo();
    }

    private void initDpPath(){
        dbPath = new HashMap<>();

        String osName = System.getProperty("os.name");
        isMac = osName.startsWith("Mac OS");

        if(isMac){
            log.info("当前系统为Mac系统");
        }

        String currentPath = System.getProperty("user.dir");
        if(null == currentPath){
            log.error("Can not get current dir");
            return;
        }

        //创建基础数据模块数据库文件目录
        String baseDataPath = currentPath + "/db/" + ModuleEnum.BASE_DATA.getDbPath();

        File dbfile = new File(baseDataPath);
        if(!dbfile.exists()){
            dbfile.mkdirs();
        }
        dbPath.put(ModuleEnum.BASE_DATA, baseDataPath);

        //创建菜品数木块数据库文件目录
        String dishDataPath = currentPath + "/db/" + ModuleEnum.DISH.getDbPath();
        dbfile = new File(dishDataPath);
        if(!dbfile.exists()){
            dbfile.mkdirs();
        }
        dbPath.put(ModuleEnum.DISH, dishDataPath);

        //创建公用数据库文件目录（交易，履约，购物车等）
        String publicDataFile = currentPath + "/db/" + ModuleEnum.ORDER.getDbPath();
        dbfile = new File(publicDataFile);
        if(!dbfile.exists()){
            dbfile.mkdirs();
        }
        dbPath.put(ModuleEnum.ORDER, publicDataFile);
    }


    /**
     * 获取基础配置，传入需要获取的配置的名称。
     *
     * @param key
     * @return
     */
    @Override
    public String getInfo(ConfigKeyEnum key){
        if (key == null) {
            System.out.println("获取配置key不能为空");
        }
        return configMap.get(key.getKey());
    }

    @Override
    public CloudConfig getCloudConfig() {
        return cloudConfig;
    }

    @Override
    public void updateGwToken(String gwToken) {
        if(null != cloudConfig){
            cloudConfig.setToken(gwToken);
        }
    }

    @Override
    public void updateOpenApiToken(String openApiToken) {
        if(null != cloudConfig){
            cloudConfig.setOpenApiToken(openApiToken);
        }
    }

    @Override
    public ProductNameEnum getProductName() {
        return ProductNameEnum.CHOICE_PRODUCT;
    }

    @Override
    public String getWorkDate() {
        return iPickConfig.getWorkDate();
    }

    private void initShopConfig(){

        String storeId = iPickConfig.getStoreId();
        configMap.put("storeId", storeId);

        String storeCode = iPickConfig.getStoreCode();
        configMap.put("storeCode", storeCode);

        String storeName = iPickConfig.getStoreName();
        configMap.put("storeName", storeName);

        String tenantId = iPickConfig.getTenantId();
        configMap.put("tenantId", tenantId);

        String kbStoreId = iPickConfig.getKbStoreId();
        configMap.put("kbStoreId", kbStoreId);

        String appId = iPickConfig.getAppId();
        configMap.put("appId", appId);

        String appSecret = iPickConfig.getAppSecret();
        configMap.put("appSecret", appSecret);

        String storeAddr = iPickConfig.getStoreAddr();
        configMap.put("storeAddr", storeAddr);

        String storePhone = iPickConfig.getStorePhone();
        configMap.put("storePhone", storePhone);
    }

    private void initGwInfo(){

        cloudConfig = new CloudConfig();

        buildGwInfo();

        if(null != cloudConfig){
            return;
        }

    }

    private void buildGwInfo(){
        if(env.equals("test") || env.equals("dev")){
            cloudConfig.setGwUrl("http://gateway.tst.choicesaas.cn");
            cloudConfig.setOpenApiUrl("http://openapi.tst.choicesaas.cn");

            mockGwInfo();
        }else {
            cloudConfig.setGwUrl("https://gateway.choicesaas.cn");
            cloudConfig.setOpenApiUrl("https://openapi.choicesaas.cn");
        }

        cloudConfig.setAppId(gwInfoConfig.getAppId());
        cloudConfig.setAppSecret(gwInfoConfig.getAppSecret());

        cloudConfig.setClientId(gwInfoConfig.getClientId());
        cloudConfig.setClientSecret(gwInfoConfig.getClientSecret());
        cloudConfig.setClientAppId(gwInfoConfig.getClientAppId());
    }

    private void mockGwInfo(){
        cloudConfig.setAppId("99908385");
        cloudConfig.setAppSecret("112c5b857610d3af5610525a75c980f2");
        cloudConfig.setGwUrl("http://gateway.tst.choicesaas.cn");
        cloudConfig.setToken("");
        cloudConfig.setClientAppId("5ebd164768beeb0001846327");
        cloudConfig.setClientId("99908428");
        cloudConfig.setClientSecret("46b1fea059331cd0aceb66ab20b7e9e2");
        cloudConfig.setOpenApiUrl("http://openapi.tst.choicesaas.cn");
    }
}