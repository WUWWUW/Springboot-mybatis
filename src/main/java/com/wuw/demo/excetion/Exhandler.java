package com.wuw.demo.excetion;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: Exhandler
 * @Package com.wuw.demo.excetion
 * @Description:
 * @author: GYW
 * @date: 2019/4/2 11:08
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目
 */
@RestControllerAdvice
public class Exhandler {

    @ExceptionHandler(value = Exception.class)
   Object handleException(Exception e, HttpServletRequest request){
       Map<String,Object> map=new HashMap<>();
       map.put("code",100);
       map.put("msg",e.getMessage());
       map.put("url",request.getRequestURI());
       return map;
   }
}
