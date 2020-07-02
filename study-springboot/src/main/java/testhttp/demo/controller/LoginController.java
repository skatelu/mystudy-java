package testhttp.demo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        if (StringUtils.isNotBlank(username) && "12345".equals(password)) {
            // 登录成功，防止表单重复提交
            session.setAttribute("loginUser", username);
            return "登录成功！";
        }else {
            return "登录失败！";
        }
    }
}
