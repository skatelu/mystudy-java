package testhttp.demo.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.interfaces.RSAPublicKey;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RSAUtilTest {

    @Test
    void getPublicKey() {

    }

    @Test
    void getPrivateKey() {
    }

    @Test
    void splitBytes() {
    }

    @Test
    void bytesToHexString() {
        String name = "";
        boolean yang = StringUtils.equals(name.trim(), "yang");
        String s = String.valueOf(name);
        System.out.println(s);
    }

    @Test
    void hexStringToBytes() {
        Map<String, String> a = new HashMap<>();
        String s = String.valueOf(a.get("c") == null ? "9999" : "123");
        int i = Integer.parseInt(s);
        System.out.println(i);
    }

    @Test
    void encryptByPublic() {
        // 获取当前时间的long值
//        long epochSecond = Instant.now().toEpochMilli();
//        String content = "370521197303054416&" + epochSecond;
//        RSAPublicKey publicKey = RSAUtil.getPublicKey();
//        String s = RSAUtil.encryptByPublic(content.getBytes(), publicKey);
//
//        for (int i = 0; i < 5; i++) {
//            code ++;
//        }
////===============================
//        // 获取code
//        int code = get(Fields.In, "sumcode").getInteger(r);
//        Integer.parseInt(code)
//        // 判断为空 ，使用name 替换 code
//        if(code == 0){
//            code = 0;
//        }
//        for (int i = 0; i < 5; i++) {
//            code ++;
//
//        }
//        get(Fields.Out, "newcode").setValue(r, code);
//
//
//        System.out.println(s);
    }

    @Test
    void decryptByPublic() {
        String tupian = "";

        RSAPublicKey publicKey = RSAUtil.getPublicKey();
        String s = Base64Utils.base64ToStream(tupian, "426", "D:\\test\\sfz\\");
//        String s = RSAUtil.decryptByPublic(result, publicKey);
//        JSONObject jsonObject = JSONObject.parseObject(s);
        System.out.println(s);
        System.out.println(1);

    }

    @Test
    void encryptByPrivate() {
    }

    @Test
    void decryptByPrivate() {
    }

    @Test
    void main() {
    }
}