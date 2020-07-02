package testhttp.demo.component;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 进行登录检查,创建完成之后，需要在 扩展SpringMVC 的实现 WebMvcConfigurer 中 添加到mvc中
 * addInterceptors 方法中加入进去  让mvc进行管理，控制
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    /**
     * 目表方法执行之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Object loginUser = request.getSession().getAttribute("loginUser");
//        System.out.println("我进来了！拦截器");
//        if (ObjectUtils.isEmpty(loginUser)) {
//            // 未登录，返回 登录页面
//            return false;
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
