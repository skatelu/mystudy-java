package testhttp.demo.service;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import testhttp.demo.model.UserSjdw;

import java.time.Instant;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {

    @Test
    void getInfo() {
        UserSjdw userSjdw = new UserSjdw();
        userSjdw.setId(1);
        userSjdw.setUserName("测试");
        userSjdw.setIdcardNumber("372328195642547821");
        userSjdw.setPoliceNum("100903");
        userSjdw.setSubBureau("测试公安局");
        userSjdw.setPhone("13546878456");
        userSjdw.setApplyTmie(24);
        userSjdw.setCreatetime(Instant.now().toEpochMilli());
        userSjdw.setUpdatetime(Instant.now().toEpochMilli());
        userSjdw.setPasstime(Instant.now().toEpochMilli());
        userSjdw.setStatus(3);
        userSjdw.setApplyStatus(2);
        userSjdw.setCaseNum("A3701053200002015071186");
        userSjdw.setApplyReason("因案件需求");

        Map<String, Object> result = new HashMap<>();

        result.put("总条数", 30);
        List<UserSjdw> userSjdwList = new ArrayList<>();
        userSjdwList.add(userSjdw);
        result.put("详细数据", userSjdwList);
        String s = JSON.toJSONString(result);
        System.out.println(s);
    }

}