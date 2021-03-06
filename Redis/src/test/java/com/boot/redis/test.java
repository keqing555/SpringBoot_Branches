package com.boot.redis;

import com.boot.redis.bean.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class test {
    /**
     * 操作对象，序列化到Redis
     */
    @Autowired
    RedisTemplate<String, Role> redisTemplate;

    @Test
    public void test2() {
        ValueOperations<String, Role> ops = redisTemplate.opsForValue();
        Role role = new Role(1, "刻晴", "匣里龙吟");
        ops.set("role1", role);
        Role role1 = ops.get("role1");
        System.out.println(role1);
    }
}
