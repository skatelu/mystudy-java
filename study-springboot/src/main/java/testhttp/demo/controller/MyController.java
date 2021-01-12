package testhttp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import testhttp.demo.config.MyConfigBean;
import testhttp.demo.exception.UserNotExistException;

import java.util.concurrent.Callable;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;
    @Value("${myConfig.myObject.myAge}")
    private Integer myAge;
    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Object getPerson() {

        System.out.println(myConfigBean.getMyAge());
        System.out.println(myConfigBean.getMyName());

        return myConfigBean;
    }

    // 测试Controller
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        if (user.equals("aaa")) {
            throw new UserNotExistException();
        }

        Callable<String> taskWork = () -> {
            Thread thread = Thread.currentThread();
            Thread.sleep(3000);
            System.out.println(thread.getName());
            return "执行完成";
        };

        return "Hello world";
    }
}
