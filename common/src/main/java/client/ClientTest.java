package client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import model.*;

import java.util.*;

public class ClientTest {


    public static void main(String[] args) {
//        BMList bmList = initShareOrgInterface("历下区公安局",1);
//        BMList bmList1 = initShareOrgInterface("历下区民政局", 2);
//        BMList bmList2 = initShareOrgInterface("高新区公安局", 3);
//        BMList bmList3 = initShareOrgInterface("历下区派出所", 4);
//        BMList bmList4 = initShareOrgInterface("行政大厅", 5);
//        BMList bmList5 = initShareOrgInterface("市中区民政局", 6);
//        BMList bmList6 = initShareOrgInterface("市中区派出所", 7);
//        BMList bmList7 = initShareOrgInterface("市中区行政大厅", 8);
//        BMList bmList8 = initShareOrgInterface("天桥区民政局", 9);
//        BMList bmList9 = initShareOrgInterface("天桥区派出所", 10);
//        BMList bmList10 = initShareOrgInterface("天桥区行政大厅", 11);
//        BMList bmList11 = initShareOrgInterface("历城区民政局", 12);
//        BMList bmList12 = initShareOrgInterface("历城区派出所", 13);
//
//        List<BMList> bmListList = new ArrayList<>();
//        bmListList.add(bmList);
//        bmListList.add(bmList1);
//        bmListList.add(bmList2);
//        bmListList.add(bmList3);
//        bmListList.add(bmList4);
//        bmListList.add(bmList5);
//        bmListList.add(bmList6);

//        List<ShareOrgCert> shareOrgCertList = initShareOrgCert();

//        ShareOrganization shareOrganization = initShareOrganization();

//        Map<String, List<Certs>> stringListMap = initCerts();

        Secretkey secretkey = initSecretkey();
        Object o = JSONArray.toJSON(secretkey);
        System.out.println(o);
    }

    public static void initDicShareInterface() {

        List<DicShareInterface> lists = new ArrayList<>();
        BMList bmList = new BMList();
        bmList.setId(1);
        bmList.setOrgName("历下区公安局");

        DicShareInterface dicShareInterface = new DicShareInterface();
        dicShareInterface.setGmtCreate(new Date());
        dicShareInterface.setGmtModified(new Date());
        dicShareInterface.setId(1L);
        dicShareInterface.setInteConsumer(2);
        dicShareInterface.setInteNote("证照检索");
        dicShareInterface.setInteRequestPath("/queryCert");
        dicShareInterface.setInteType(0);
        dicShareInterface.setIsDeleted(0);

        DicShareInterface dicShareInterface1 = new DicShareInterface();
        dicShareInterface1.setGmtCreate(new Date());
        dicShareInterface1.setGmtModified(new Date());
        dicShareInterface1.setId(2L);
        dicShareInterface1.setInteConsumer(2);
        dicShareInterface1.setInteNote("证照标识下载证照文件");
        dicShareInterface1.setInteRequestPath("/downloadFile");
        dicShareInterface1.setInteType(0);
        dicShareInterface1.setIsDeleted(0);

        DicShareInterface dicShareInterface2 = new DicShareInterface();
        dicShareInterface2.setGmtCreate(new Date());
        dicShareInterface2.setGmtModified(new Date());
        dicShareInterface2.setId(3L);
        dicShareInterface2.setInteConsumer(2);
        dicShareInterface2.setInteNote("证照标识获取下载地址");
        dicShareInterface2.setInteRequestPath("/downloadUrl");
        dicShareInterface2.setInteType(0);
        dicShareInterface2.setIsDeleted(0);

        DicShareInterface dicShareInterface3 = new DicShareInterface();
        dicShareInterface3.setGmtCreate(new Date());
        dicShareInterface3.setGmtModified(new Date());
        dicShareInterface3.setId(4L);
        dicShareInterface3.setInteConsumer(2);
        dicShareInterface3.setInteNote("证照标识获取证照信息");
        dicShareInterface3.setInteRequestPath("/queryCertInfo");
        dicShareInterface3.setInteType(0);
        dicShareInterface3.setIsDeleted(0);

        DicShareInterface dicShareInterface4 = new DicShareInterface();
        dicShareInterface4.setGmtCreate(new Date());
        dicShareInterface4.setGmtModified(new Date());
        dicShareInterface4.setId(5L);
        dicShareInterface4.setInteConsumer(2);
        dicShareInterface4.setInteNote("证照类型代码验证证照信息");
        dicShareInterface4.setInteRequestPath("/verifyCertInfo");
        dicShareInterface4.setInteType(0);
        dicShareInterface4.setIsDeleted(0);

        DicShareInterface dicShareInterface5 = new DicShareInterface();
        dicShareInterface5.setGmtCreate(new Date());
        dicShareInterface5.setGmtModified(new Date());
        dicShareInterface5.setId(6L);
        dicShareInterface5.setInteConsumer(2);
        dicShareInterface5.setInteNote("证照类型代码验证证照文件");
        dicShareInterface5.setInteRequestPath("/verifyFile");
        dicShareInterface5.setInteType(0);
        dicShareInterface5.setIsDeleted(0);


        DicShareInterface dicShareInterface6 = new DicShareInterface();
        dicShareInterface6.setGmtCreate(new Date());
        dicShareInterface6.setGmtModified(new Date());
        dicShareInterface6.setId(7L);
        dicShareInterface6.setInteConsumer(2);
        dicShareInterface6.setInteNote("基于证照持有主体代码下载服务");
        dicShareInterface6.setInteRequestPath("/elssp/v1/GetCertificateFileByHolder");
        dicShareInterface6.setInteType(0);
        dicShareInterface6.setIsDeleted(0);

        DicShareInterface dicShareInterface7 = new DicShareInterface();
        dicShareInterface7.setGmtCreate(new Date());
        dicShareInterface7.setGmtModified(new Date());
        dicShareInterface7.setId(8L);
        dicShareInterface7.setInteConsumer(2);
        dicShareInterface7.setInteNote("基于证照标识下载服务");
        dicShareInterface7.setInteRequestPath("/elssp/v1/GetCertificateFileByCertificateID");
        dicShareInterface7.setInteType(0);
        dicShareInterface7.setIsDeleted(0);

        DicShareInterface dicShareInterface8 = new DicShareInterface();
        dicShareInterface8.setGmtCreate(new Date());
        dicShareInterface8.setGmtModified(new Date());
        dicShareInterface8.setId(9L);
        dicShareInterface8.setInteConsumer(2);
        dicShareInterface8.setInteNote("基于证照持有主体代码信息获取服务");
        dicShareInterface.setInteRequestPath("/elssp/v1/GetCertificateDataByHolder");
        dicShareInterface8.setInteType(0);
        dicShareInterface8.setIsDeleted(0);

        DicShareInterface dicShareInterface9 = new DicShareInterface();
        dicShareInterface9.setGmtCreate(new Date());
        dicShareInterface9.setGmtModified(new Date());
        dicShareInterface9.setId(10L);
        dicShareInterface9.setInteConsumer(2);
        dicShareInterface9.setInteNote("基于证照标识信息获取服务");
        dicShareInterface9.setInteRequestPath("/elssp/v1/GetCertificateDataByCertificateID");
        dicShareInterface9.setInteType(0);
        dicShareInterface9.setIsDeleted(0);

        lists.add(dicShareInterface);
        lists.add(dicShareInterface1);
        lists.add(dicShareInterface2);
        lists.add(dicShareInterface3);
        lists.add(dicShareInterface4);
        lists.add(dicShareInterface5);
        lists.add(dicShareInterface6);
        lists.add(dicShareInterface7);
        lists.add(dicShareInterface8);
        lists.add(dicShareInterface9);

    }

    public static BMList initShareOrgInterface(String name, int n) {

        List<ShareOrgInterface> lists = new ArrayList<>();
        BMList bmList = new BMList();
        bmList.setId(n);
        bmList.setOrgName(name);

        ShareOrgInterface shareOrgInterface = new ShareOrgInterface();
        ShareOrgInterface shareOrgInterface1 = new ShareOrgInterface();
        ShareOrgInterface shareOrgInterface2 = new ShareOrgInterface();
        ShareOrgInterface shareOrgInterface3 = new ShareOrgInterface();
        ShareOrgInterface shareOrgInterface4 = new ShareOrgInterface();
        ShareOrgInterface shareOrgInterface5 = new ShareOrgInterface();
        ShareOrgInterface shareOrgInterface6 = new ShareOrgInterface();

        shareOrgInterface.setId(1L);
        shareOrgInterface.setGmtCreate(new Date());
        shareOrgInterface.setGmtModified(new Date());
        shareOrgInterface.setIsDeleted(0);
        shareOrgInterface.setShareInteId(1);
        shareOrgInterface.setInteNote("证照检索");
        shareOrgInterface.setShareOrgId(n);
        shareOrgInterface.setStatus(0);

        shareOrgInterface1.setId(2L);
        shareOrgInterface1.setGmtCreate(new Date());
        shareOrgInterface1.setGmtModified(new Date());
        shareOrgInterface1.setIsDeleted(0);
        shareOrgInterface1.setShareInteId(2);
        shareOrgInterface1.setInteNote("证照标识下载证照文件");
        shareOrgInterface1.setShareOrgId(n);
        shareOrgInterface1.setStatus(0);

        shareOrgInterface2.setId(3L);
        shareOrgInterface2.setGmtCreate(new Date());
        shareOrgInterface2.setGmtModified(new Date());
        shareOrgInterface2.setIsDeleted(0);
        shareOrgInterface2.setShareInteId(3);
        shareOrgInterface2.setInteNote("证照标识获取下载地址");
        shareOrgInterface2.setShareOrgId(n);
        shareOrgInterface2.setStatus(0);

        shareOrgInterface3.setId(4L);
        shareOrgInterface3.setGmtCreate(new Date());
        shareOrgInterface3.setGmtModified(new Date());
        shareOrgInterface3.setIsDeleted(0);
        shareOrgInterface3.setShareInteId(4);
        shareOrgInterface3.setInteNote("证照标识获取证照信息");
        shareOrgInterface3.setShareOrgId(n);
        shareOrgInterface3.setStatus(0);

        shareOrgInterface4.setId(5L);
        shareOrgInterface4.setGmtCreate(new Date());
        shareOrgInterface4.setGmtModified(new Date());
        shareOrgInterface4.setIsDeleted(0);
        shareOrgInterface4.setShareInteId(5);
        shareOrgInterface4.setInteNote("基于证照持有主体代码下载服务");
        shareOrgInterface4.setShareOrgId(n);
        shareOrgInterface4.setStatus(0);

        shareOrgInterface5.setId(6L);
        shareOrgInterface5.setGmtCreate(new Date());
        shareOrgInterface5.setGmtModified(new Date());
        shareOrgInterface5.setIsDeleted(0);
        shareOrgInterface5.setShareInteId(6);
        shareOrgInterface5.setInteNote("XX接口");
        shareOrgInterface5.setShareOrgId(n);
        shareOrgInterface5.setStatus(0);

        shareOrgInterface6.setId(7L);
        shareOrgInterface6.setGmtCreate(new Date());
        shareOrgInterface6.setGmtModified(new Date());
        shareOrgInterface6.setIsDeleted(0);
        shareOrgInterface6.setShareInteId(7);
        shareOrgInterface6.setInteNote("XX接口");
        shareOrgInterface6.setShareOrgId(n);
        shareOrgInterface6.setStatus(0);

        lists.add(shareOrgInterface);
        lists.add(shareOrgInterface1);
        lists.add(shareOrgInterface2);
        lists.add(shareOrgInterface3);
        lists.add(shareOrgInterface4);
        lists.add(shareOrgInterface5);
        lists.add(shareOrgInterface6);

        bmList.setShareOrgInterfaceList(lists);

        return bmList;
    }

    public static ShareOrganization initShareOrganization() {
        ShareOrganization shareOrganization = new ShareOrganization();

        shareOrganization.setId(1L);
        shareOrganization.setIsDeleted(0);
        shareOrganization.setGmtCreate(new Date());
        shareOrganization.setGmtModified(new Date());
        shareOrganization.setAppId("SDDZZZ");
        shareOrganization.setPublicKey("123456");
        shareOrganization.setPrivateKey("456789");
        shareOrganization.setOrgName("历下区公安局");
        shareOrganization.setProvince("山东省");
        shareOrganization.setCity("济南市");
        shareOrganization.setCounty("历下区");
        shareOrganization.setAddress("xxx路xxx号");
        shareOrganization.setVisitIps("127.0.0.1,192.168.100.101");
        shareOrganization.setContact("赵四六");
        shareOrganization.setPhone("12345875568");
        shareOrganization.setRemarks("共享接口备注");
        return shareOrganization;
    }

    public static List<ShareOrgCert> initShareOrgCert() {
        List<ShareOrgCert> shareOrgCertList = new ArrayList<>();
        ShareOrgCert shareOrgCert = new ShareOrgCert();
        ShareOrgCert shareOrgCert1 = new ShareOrgCert();
        ShareOrgCert shareOrgCert2 = new ShareOrgCert();
        ShareOrgCert shareOrgCert3 = new ShareOrgCert();
        ShareOrgCert shareOrgCert4 = new ShareOrgCert();
        ShareOrgCert shareOrgCert5 = new ShareOrgCert();
        ShareOrgCert shareOrgCert6 = new ShareOrgCert();

        shareOrgCert.setId(1L);
        shareOrgCert.setIsDeleted(0);
        shareOrgCert.setGmtCreate(new Date());
        shareOrgCert.setGmtModified(new Date());
        shareOrgCert.setShareOrgId(1);
        shareOrgCert.setCertId(1);
        shareOrgCert.setCertName("居民身份证");
        shareOrgCert.setAllowInteIds("192.168.25.103,192.168.25.104,192.168.25.112");
        shareOrgCert.setEverydayToplimit(2000);
        shareOrgCert.setUsedTimes(523);
        shareOrgCert.setYxqqsrq(new Date());
        shareOrgCert.setYxqjzrq(new Date());
        shareOrgCert.setFields("{\"name\":\"姓名\",\"sex\":\"性别\",\"ownersfzhm\":\"身份证件号码\",\"category\":\"专业类别\",\"certno\":\"证书编号\",\"pzrq\":\"批准日期\"}");

        shareOrgCert1.setId(2L);
        shareOrgCert1.setIsDeleted(0);
        shareOrgCert1.setGmtCreate(new Date());
        shareOrgCert1.setGmtModified(new Date());
        shareOrgCert1.setShareOrgId(1);
        shareOrgCert1.setCertId(1);
        shareOrgCert1.setCertName("机动车驾驶证");
        shareOrgCert1.setAllowInteIds("192.168.25.103,192.168.25.104,192.168.25.112");
        shareOrgCert1.setEverydayToplimit(2000);
        shareOrgCert1.setUsedTimes(523);
        shareOrgCert1.setYxqqsrq(new Date());
        shareOrgCert1.setYxqjzrq(new Date());
        shareOrgCert1.setFields("{\"name\":\"姓名\",\"sex\":\"性别\",\"ownersfzhm\":\"身份证件号码\",\"category\":\"专业类别\",\"certno\":\"证书编号\",\"pzrq\":\"批准日期\"}");

        shareOrgCert2.setId(3L);
        shareOrgCert2.setIsDeleted(0);
        shareOrgCert2.setGmtCreate(new Date());
        shareOrgCert2.setGmtModified(new Date());
        shareOrgCert2.setShareOrgId(1);
        shareOrgCert2.setCertId(2);
        shareOrgCert2.setCertName("机动车行驶证");
        shareOrgCert2.setAllowInteIds("192.168.25.103,192.168.25.104,192.168.25.112");
        shareOrgCert2.setEverydayToplimit(2000);
        shareOrgCert2.setUsedTimes(523);
        shareOrgCert2.setYxqqsrq(new Date());
        shareOrgCert2.setYxqjzrq(new Date());
        shareOrgCert2.setFields("{\"name\":\"姓名\",\"sex\":\"性别\",\"ownersfzhm\":\"身份证件号码\",\"category\":\"专业类别\",\"certno\":\"证书编号\",\"pzrq\":\"批准日期\"}");

        shareOrgCert3.setId(4L);
        shareOrgCert3.setIsDeleted(0);
        shareOrgCert3.setGmtCreate(new Date());
        shareOrgCert3.setGmtModified(new Date());
        shareOrgCert3.setShareOrgId(1);
        shareOrgCert3.setCertId(3);
        shareOrgCert3.setCertName("居民户口本");
        shareOrgCert3.setAllowInteIds("192.168.25.103,192.168.25.104,192.168.25.112");
        shareOrgCert3.setEverydayToplimit(2000);
        shareOrgCert3.setUsedTimes(523);
        shareOrgCert3.setYxqqsrq(new Date());
        shareOrgCert3.setYxqjzrq(new Date());
        shareOrgCert3.setFields("{\"name\":\"姓名\",\"sex\":\"性别\",\"ownersfzhm\":\"身份证件号码\",\"category\":\"专业类别\",\"certno\":\"证书编号\",\"pzrq\":\"批准日期\"}");

        shareOrgCert4.setId(5L);
        shareOrgCert4.setIsDeleted(0);
        shareOrgCert4.setGmtCreate(new Date());
        shareOrgCert4.setGmtModified(new Date());
        shareOrgCert4.setShareOrgId(1);
        shareOrgCert4.setCertId(4);
        shareOrgCert4.setCertName("护照");
        shareOrgCert4.setAllowInteIds("192.168.25.103,192.168.25.104,192.168.25.112");
        shareOrgCert4.setEverydayToplimit(2000);
        shareOrgCert4.setUsedTimes(523);
        shareOrgCert4.setYxqqsrq(new Date());
        shareOrgCert4.setYxqjzrq(new Date());
        shareOrgCert4.setFields("{\"name\":\"姓名\",\"sex\":\"性别\",\"ownersfzhm\":\"身份证件号码\",\"category\":\"专业类别\",\"certno\":\"证书编号\",\"pzrq\":\"批准日期\"}");

        shareOrgCert5.setId(6L);
        shareOrgCert5.setIsDeleted(0);
        shareOrgCert5.setGmtCreate(new Date());
        shareOrgCert5.setGmtModified(new Date());
        shareOrgCert5.setShareOrgId(1);
        shareOrgCert5.setCertId(5);
        shareOrgCert5.setCertName("居住证");
        shareOrgCert5.setAllowInteIds("192.168.25.103,192.168.25.104,192.168.25.112");
        shareOrgCert5.setEverydayToplimit(2000);
        shareOrgCert5.setUsedTimes(523);
        shareOrgCert5.setYxqqsrq(new Date());
        shareOrgCert5.setYxqjzrq(new Date());
        shareOrgCert5.setFields("{\"name\":\"姓名\",\"sex\":\"性别\",\"ownersfzhm\":\"身份证件号码\",\"category\":\"专业类别\",\"certno\":\"证书编号\",\"pzrq\":\"批准日期\"}");

        shareOrgCert6.setId(7L);
        shareOrgCert6.setIsDeleted(0);
        shareOrgCert6.setGmtCreate(new Date());
        shareOrgCert6.setGmtModified(new Date());
        shareOrgCert6.setShareOrgId(1);
        shareOrgCert6.setCertId(6);
        shareOrgCert6.setCertName("往来港澳通行证");
        shareOrgCert6.setAllowInteIds("192.168.25.103,192.168.25.104,192.168.25.112");
        shareOrgCert6.setEverydayToplimit(2000);
        shareOrgCert6.setUsedTimes(523);
        shareOrgCert6.setYxqqsrq(new Date());
        shareOrgCert6.setYxqjzrq(new Date());
        shareOrgCert6.setFields("{\"name\":\"姓名\",\"sex\":\"性别\",\"ownersfzhm\":\"身份证件号码\",\"category\":\"专业类别\",\"certno\":\"证书编号\",\"pzrq\":\"批准日期\"}");

        shareOrgCertList.add(shareOrgCert);
        shareOrgCertList.add(shareOrgCert1);
        shareOrgCertList.add(shareOrgCert2);
        shareOrgCertList.add(shareOrgCert3);
        shareOrgCertList.add(shareOrgCert4);
        shareOrgCertList.add(shareOrgCert5);
        shareOrgCertList.add(shareOrgCert6);

        return shareOrgCertList;
    }

    public static Map<String, List<Certs>> initCerts() {

        Map<String, List<Certs>> certMap = new HashMap<>();

        List<Certs> certList = new ArrayList<>();
        Certs certs = new Certs();
        certs.setId(1);
        certs.setCertName("身份证");
        Certs certs1 = new Certs();
        certs1.setId(2);
        certs1.setCertName("驾驶证");
        Certs certs2 = new Certs();
        certs2.setId(3);
        certs2.setCertName("行驶证");
        Certs certs3 = new Certs();
        certs3.setId(4);
        certs3.setCertName("证照名");
        Certs certs4 = new Certs();
        certs4.setId(5);
        certs4.setCertName("证照名");
        certList.add(certs);
        certList.add(certs1);
        certList.add(certs2);
        certList.add(certs3);
        certList.add(certs4);
        certMap.put("公安厅", certList);

        certMap.put("农业农村厅", certList);
        certMap.put("部门名称", certList);

        return certMap;

    }

    public static Secretkey initSecretkey(){
        Secretkey secretkey = new Secretkey();
        secretkey.setAppId("SDDZZZ");
        secretkey.setPublicKey("04D4FB95943B9E0419390A37B48A6F2805F90960C78FFE74E8416BD62CB832288E62857281094ECB5B3A28A6D148C550358EB243802D49F72D8E0CFC");
        secretkey.setPrivateKey("04D4FB95943B9E0419390A37B48A6F2805F90960C78FFE74E8416BD62CB832288E62857281094ECB5B3A28A6D148C550358EB243802D49F72D8E0CFC");

        return secretkey;
    }

}
