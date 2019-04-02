package com.wuw.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: RedisPoolFactory
 * @Package com.wuw.demo.redis
 * @Description:
 * @author: WUW
 * @date: 2019/4/2 20:15
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
@Service
public class RedisPoolFactory {

    @Autowired
    RedisConfig  redisConfig;

    /**
     * 配置redis连接池
     * 将redis连接池注入spring容器
     * @return
     */
    @Bean
    public JedisPool JedisPoolFactory(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(redisConfig.getPoolMaxIdle());
        config.setMaxTotal(redisConfig.getPoolMaxTotal());
        config.setMaxWaitMillis(redisConfig.getPoolMaxWait() * 1000);
        JedisPool jp = new JedisPool(config, redisConfig.getHost(), redisConfig.getPort(),
                redisConfig.getTimeout()*1000, null, 0);
        return jp;
    }

}
