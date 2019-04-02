package com.wuw.demo.redis;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: KeyPrefix
 * @Package com.wuw.demo.redis
 * @Description:
 * @author: WUW
 * @date: 2019/4/2 20:05
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
public interface KeyPrefix {
    /**
     * 有效期
     * @return
     */
    public int expireSeconds();

    /**
     * 前缀
     * @return
     */
    public String getPrefix();
}
