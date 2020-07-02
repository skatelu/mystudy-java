package testhttp.demo.redis;

import com.alibaba.fastjson.JSONObject;

public class TestPing {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("hello", "world");
        jsonObject.put("name", "yjl");
        //1、创建 Jedis 对象
//        Jedis jedis = new Jedis("192.168.204.5", 6379);
//        // jedis 所有的命令就是我们之前学习的指令,指令就是jedis中的方法
//
//        jedis.select(2);
//        // 开启事务
//        Transaction multi = jedis.multi();
//        String result = jsonObject.toJSONString();
//        try {
//            multi.set("user1", result);
//            multi.set("user2", result);
//            int i = 1 / 0;// 代码抛出异常 事务执行失败
//            multi.exec();
//        } catch (Exception e) {
//            //执行失败的话 放弃事务
//            multi.discard();
//            e.printStackTrace();
//        } finally {
//            // 关闭连接
//            System.out.println(jedis.get("user1"));
//            System.out.println(jedis.get("user2"));
//
//            jedis.close();
//        }

    }
}
