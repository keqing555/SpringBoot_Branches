package com.boot.redis.configuration;

import com.boot.redis.bean.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * 给RedisTemplate模板设置序列化方式
 */
@Configuration
public class MyRedisSerializable {
    @Bean
    public RedisTemplate<String, Role> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Role> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        //设置序列化器
        Jackson2JsonRedisSerializer<Role> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Role>(Role.class);
        template.setDefaultSerializer(jackson2JsonRedisSerializer);
        return template;
    }
}
