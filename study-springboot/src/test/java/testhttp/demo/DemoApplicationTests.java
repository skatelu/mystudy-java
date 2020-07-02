package testhttp.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {

        // OPS 开头 表示操作不同的数据类型
        // opsForValue() 操作字符串，类似String
        redisTemplate.opsForValue().set("user3", "123456");
        System.out.println(redisTemplate.opsForValue().get("user3"));

    }

}
