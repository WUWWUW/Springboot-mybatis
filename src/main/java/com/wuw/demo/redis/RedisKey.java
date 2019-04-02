package com.wuw.demo.redis;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: RedisKey
 * @Package com.wuw.demo.redis
 * @Description:
 * @author: WUW
 * @date: 2019/4/2 20:10
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
public class RedisKey extends BasePrefix {


    public static final int KEY_EXPIRE=3600*24*3;
    /**
     * 防止被外面实例化
     * @param expireSecondes
     * @param prefix
     */
    private RedisKey(int expireSecondes, String prefix) {
        super(expireSecondes, prefix);
    }

    public static RedisKey redisKey=new RedisKey(KEY_EXPIRE,"user");
}
