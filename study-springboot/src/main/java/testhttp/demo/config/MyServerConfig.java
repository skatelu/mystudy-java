package testhttp.demo.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import testhttp.demo.servlet.MyServlet;

@Component
public class MyServerConfig {

    /**
     * 注册三大组件
     */
    @Bean
    public ServletRegistrationBean MyServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean<>(new MyServlet(), "/myservlet");
        return servletRegistrationBean;
    }

    /**
     * 自定义配置 配置嵌入式的Servlet容器
     * 定制和修改servlet容器的相关配置
     * 如 修改端口号 等等的配置信息
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> myWebServerFactoryCustomizer() {

        return new WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>() {
            @Override
            public void customize(ConfigurableServletWebServerFactory factory) {
                factory.setPort(8085);
            }
        };
    }
}
