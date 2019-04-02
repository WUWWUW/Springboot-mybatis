package com.wuw.demo.redis;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: BasePrefix
 * @Package com.wuw.demo.redis
 * @Description:
 * @author: WUW
 * @date: 2019/4/2 20:06
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
public abstract class BasePrefix implements KeyPrefix {
    //有效期
    private int expireSecondes;
    //前缀
    private String prefix;

    public BasePrefix(String prefix){
        this(0,prefix);  //默认为0表示永不过期
    }

    public BasePrefix(int expireSecondes, String prefix) {
        this.expireSecondes = expireSecondes;
        this.prefix = prefix;
    }

    @Override
    public int expireSeconds() {
        return expireSecondes;
    }

    @Override
    public String getPrefix() {
        String className=getClass().getSimpleName();   //拿到参数类类名
        return className+":"+prefix;
    }
}
