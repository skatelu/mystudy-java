package com.example.changedata.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.changedata.common.utils.HttpUtils;
import com.example.changedata.common.utils.OutToFile;
import com.example.changedata.common.utils.RestTemplateUtil;
import com.example.changedata.dao.CertCjrzMapper;
import com.example.changedata.model.CertCjrz;
import com.example.changedata.model.SclZhrmghgcjrzAll;
import com.example.changedata.service.CjrService;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.*;

import static com.example.changedata.common.utils.OutToFile.saveAsFileWriter;

@Service
public class CjrServiceImpl implements CjrService {

    @Autowired
    private CertCjrzMapper certCjrzMapper;
    @Autowired
    private SclZhrmghgcjrzServiceImpl sclZhrmghgcjrzService;

    @Override
    public int saveCjrz(CertCjrz certCjrz) {

        certCjrz.setOwnersfzhm("123456");
        certCjrz.setName("试试");
        certCjrz.setIsDeleted(0);
        certCjrz.setName("");
        certCjrz.setBlankFile("");
        certCjrz.setCertIdentifier("");
        certCjrz.setCertNumber("");
        certCjrz.setCertno("");
        certCjrz.setGmtCreate(new Date());
        certCjrz.setGmtModified(new Date());
        certCjrz.setIssuingOrgId(5);
        certCjrz.setCreditcode("");
        certCjrz.setSex("nan");
        certCjrz.setCjtype("");
        certCjrz.setCjlevel("");
        certCjrz.setZzbfrq(new Date());
        certCjrz.setZzyxqjzrq(new Date());
        certCjrz.setZzyxqqsrq(new Date());
        certCjrz.setStatus(1);
        certCjrz.setSource(0);
        int insert = certCjrzMapper.insert(certCjrz);
        return insert;
    }

    @Override
    public String queryAPICertData(String apiurl) {
        int maxId = 4579015; // 223783
        int count = 4579;

        for (int i = 0; i < 4580; i++) {
            List<SclZhrmghgcjrzAll> sclZhrmghg = sclZhrmghgcjrzService.findSclZhrmghg(i * 1000, ((i + 1) * 1000 - 1));

            for (SclZhrmghgcjrzAll sclZhrmghgcjrzAll : sclZhrmghg) {
                Map<String, Object> params = new HashMap<>();
                params.put("name", sclZhrmghgcjrzAll.getCertificateholder());
                params.put("sfzhm",sclZhrmghgcjrzAll.getCertificateholdercode());

                String json = JSON.toJSONString(params);

                String result = HttpUtils.sendPost(apiurl, json);

                JSONObject jsonObject = JSONObject.parseObject(result);

                if (StringUtils.isNotBlank((CharSequence) jsonObject.get("error"))) {
                    continue;
                }
//             将JSONObject 转换成 CertCjrz
                if(StringUtils.isNotBlank(jsonObject.toJSONString())){
                    JSONObject resultData = jsonObject.getJSONObject("data");
                    JSONObject objData = resultData.getJSONObject("data");
                    if(objData == null){
                        System.out.println("未获取到残疾人数据，name = "+ sclZhrmghgcjrzAll.getCertificateholder()+",身份证号："+sclZhrmghgcjrzAll.getCertificateholdercode());
                        OutToFile.saveAsFileWriter("name:"+ sclZhrmghgcjrzAll.getCertificateholder()+" 身份证号："+sclZhrmghgcjrzAll.getCertificateholdercode());
                        continue;
                    }
                    //姓名
                    String name = objData.getString("name");
                    //性别
                    String sex = objData.getString("genderName");
                    //身份证号
                    String ownerSfzhm = objData.getString("citizenId");
                    //残疾证号
                    String cardNum = objData.getString("cardNum");
                    //残疾类别
                    String idtKindName = objData.getString("idtKindName");
                    //残疾等级
                    String idtLevelName = objData.getString("idtLevelName");


                    CertCjrz cert = new CertCjrz();
                    cert.setName(name);
                    cert.setSex(sex);
                    cert.setOwnersfzhm(ownerSfzhm);
                    cert.setCertno(cardNum);
                    cert.setCjtype(idtKindName);
                    cert.setCjlevel(idtLevelName);
                    cert.setSource(3);
                    cert.setStatus(0);
                    cert.setIssuingOrgId(105);
                    cert.setIsDeleted(0);
                    cert.setGmtModified(new Date());
                    cert.setGmtCreate(new Date());
                    cert.setZzbfrq(sclZhrmghgcjrzAll.getFirstTime());
                    cert.setZzyxqqsrq(sclZhrmghgcjrzAll.getStime());
                    cert.setZzyxqjzrq(sclZhrmghgcjrzAll.getEtime());
                    certCjrzMapper.insert(cert);
                }
            }
            System.out.println(i * 1000 +"============="+ ((i + 1) * 1000 - 1));
        }
        //请求第三方接口地址

        return "获取成功";
    }

//    public static void main(String[] args) {
//        Map<String, Object> params = new HashMap<>();
//        params.put("name", "翟鲁行");
//        params.put("sfzhm","372928200101272214");
//
//        String json = JSON.toJSONString(params);
//
//        String result = "{\"code\":200.0,\"data\":\"{\\\"result\\\":true,\\\"errorcode\\\":0,\\\"msg\\\":\\\"获取成功\\\",\\\"data\\\":{\\\"isNewRecord\\\":true,\\\"delFlag\\\":\\\"0\\\",\\\"pageNo\\\":0,\\\"pageSize\\\":0,\\\"name\\\":\\\"翟鲁行\\\",\\\"genderName\\\":\\\"男\\\",\\\"citizenId\\\":\\\"372928200101272214\\\",\\\"cardNum\\\":\\\"37292820010127221422\\\",\\\"idtKindName\\\":\\\"听力\\\",\\\"idtLevelName\\\":\\\"二级\\\",\\\"eduLevelName\\\":\\\"高中\\\",\\\"marriagerName\\\":\\\"未婚\\\",\\\"guardian\\\":\\\"翟建贯\\\",\\\"guardianPhone\\\":\\\"15854043459\\\",\\\"guardianRName\\\":\\\"其他\\\",\\\"raceName\\\":\\\"汉族\\\",\\\"certDate\\\":1500220800000,\\\"residentAdd\\\":\\\"山东省菏泽市郓城县唐庙乡陈南行政村陈南村154号唐庙乡陈南行政村陈南村154号\\\",\\\"nowAdd\\\":\\\"山东省菏泽市郓城县唐庙乡陈南行政村陈南村154号唐庙乡陈南行政村陈南村154号\\\",\\\"phoneNo\\\":\\\"15854043459\\\"}}\",\"message\":\"\"}";
//
//        JSONObject jsonObject = JSONObject.parseObject(result);
//
////             将JSONObject 转换成 CertCjrz
//        if(StringUtils.isNotBlank(jsonObject.toJSONString())) {
//            JSONObject resultData = jsonObject.getJSONObject("data");
//            JSONObject objData = resultData.getJSONObject("data");
//            if (objData == null) {
////                System.out.println("未获取到残疾人数据，name = " + sclZhrmghgcjrzAll.getCertificateholder() + ",身份证号：" + sclZhrmghgcjrzAll.getCertificateholdercode());
////                OutToFile.saveAsFileWriter("name:" + sclZhrmghgcjrzAll.getCertificateholder() + " 身份证号：" + sclZhrmghgcjrzAll.getCertificateholdercode());
////                continue;
//            }
//            //姓名
//            String name = objData.getString("name");
//            //性别
//            String sex = objData.getString("genderName");
//            //身份证号
//            String ownerSfzhm = objData.getString("citizenId");
//            //残疾证号
//            String cardNum = objData.getString("cardNum");
//            //残疾类别
//            String idtKindName = objData.getString("idtKindName");
//            //残疾等级
//            String idtLevelName = objData.getString("idtLevelName");
//        }
//
//    }
}
