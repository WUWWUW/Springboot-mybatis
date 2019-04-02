package com.wuw.demo.excetion;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: MyException
 * @Package com.wuw.demo.excetion
 * @Description:
 * @author: GYW
 * @date: 2019/4/2 11:04
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目
 */
public class MyException extends RuntimeException {
    public String code;
    public String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public MyException(String code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
