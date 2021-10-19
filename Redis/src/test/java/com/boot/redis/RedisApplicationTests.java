package com.boot.redis;

import com.boot.redis.bean.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisApplicationTests {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    void contextLoads() {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        //存
        ops.set("role", "刻晴");
        //取
        String role = ops.get("role");
        System.out.println(role);
        //删
        //  redisTemplate.delete("role");
    }


}
