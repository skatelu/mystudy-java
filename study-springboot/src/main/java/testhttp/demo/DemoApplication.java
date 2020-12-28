package testhttp.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * JDWP：Java Debug Wire Protocol, Java调试协议  可以进行远程调试
 * JDWP 远程协议服务端启动命令
 *  Java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5050 -jar xxx.jar
 *  transport=dt_socket:使用socket协议进行远程调试
 *  suspend=y：标识服务器一启动的时候就等待开始调试的链接
 *  server=y：表示一直监听客户端调试的链接
 *  address=5050：表示监听5050端口，在5050端口号上等待调试的链接
 *
 *  IDEA 在使用的时候 需要创建一个 Remote 启动命令 选择 Attach to remote JVM 附加到远程代码上，然后启动 就可以进行调试了
 *
 *  @SpringBootApplication 启动过程
 *      触发三个作用
 *          1、触发配置类  @SpringBootConfiguration
 *          2、进行自动配置 @EnableAutoConfiguration
 *          3、进行组件扫描 @ComponentScan
 *
 *
 *
 */
@SpringBootApplication
@MapperScan("testhttp.demo.sqlitetest.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        /**
         * 可以设置 Banner 是否打印 Banner就是打印时候的 SpringBoot
         */
//        SpringApplication springApplication = new SpringApplication(DemoApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);
    }

    // 自定义视图解析器
/*    public ViewResolver myViewReolver(){
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }*/
}
