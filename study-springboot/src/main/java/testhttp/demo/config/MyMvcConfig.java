package testhttp.demo.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import testhttp.demo.component.LoginHandlerInterceptor;

/**
 * 扩展SpringMVC
 * 使用 WebMvcConfigurer 可以来扩展SpringMVC的功能
 * @EnableWebMvc 加上后将全面接管 SpringMVC
 */
//@EnableWebMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送 /yangjunlu 请求来到 success
        registry.addViewController("/yangjunlu").setViewName("success");
    }

    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 用 InterceptorRegistry 将拦截器的实现添加到 SpringMVC 中  addPathPatterns 这个用来添加需要拦截哪些请求，支持通配符
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html","/","/user/login"); // excludePathPatterns 表示需要排除哪些请求，即哪些请求不需要进行拦截

    }
}
