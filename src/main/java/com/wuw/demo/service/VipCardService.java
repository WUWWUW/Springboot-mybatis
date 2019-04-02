package com.wuw.demo.service;

import com.wuw.demo.dao.VipCardMapper;
import com.wuw.demo.domain.VipCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: VipCardService
 * @Package com.wuw.demo.service
 * @Description:
 * @author: WUW
 * @date: 2019/4/1 21:53
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
@Service
public class VipCardService {
    @Autowired
    public VipCardMapper vipCardMapper;

    public String addVipCard(VipCard vipCard){
        vipCardMapper.insert(vipCard);
        return "success";
    }


}
