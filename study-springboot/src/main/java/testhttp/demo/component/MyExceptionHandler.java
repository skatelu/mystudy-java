package testhttp.demo.component;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import testhttp.demo.exception.UserNotExistException;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 *  @ControllerAdvice  这是一个增强的Controller
 *  1、全局异常处理
 *  2、全局数据绑定
 *  3、全局数据预处理
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * @return
     * @ExceptionHandler 这个注解  表示要处理什么样的异常
     * UserNotExistException.class  表示处理用户不存在异常
     * 如果为 Exception.class 表示处理所有异常
     * 浏览器与客户端返回的都是JSON数据
     */
//    @ResponseBody
//    @ExceptionHandler(UserNotExistException.class)
//    public String handleException(Exception e) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("code", "user.notexist");
//        map.put("message", e.getMessage());
//        return JSON.toJSONString(map);
//    }

    /**
     * 实现自适应效果的错误处理
     * 切记  一定要传入自己的错误状态码，否则就不会进入定制错误页面的解析流程
     * @param e
     * @return
     */
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        // 传入我们自己的状态码  如果不传入  默认200
//        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user.notexist");
        map.put("message", "用户出错了=========");
        request.setAttribute("1", map);
        // 转发到 /Error 请求
        return "forward:/error";
    }
}
