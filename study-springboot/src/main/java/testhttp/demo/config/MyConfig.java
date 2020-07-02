package testhttp.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 表示此类是一个配置类，SpringBoot通过包扫描就能获取到这个类，并加载相关配置
 * @Configuration: 指明当前类是一个配置类 在配置文件中用<bean><bean/>标签添加组件
 */
@Configuration
public class MyConfig {

    /**
     * @Bean 用于标识 当前返回的类是 Spring 中的一个对象 受 SpringBoot 管理
     * 将方法的返回值添加到容器中；容器中这个组件默认的 id 就是方法名
     * @return
     */
    @Bean
    public MyConfigBean myConfigBean(){
        return new MyConfigBean();
    }
}
