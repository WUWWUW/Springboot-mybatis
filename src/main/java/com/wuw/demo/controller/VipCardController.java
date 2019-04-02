package com.wuw.demo.controller;

import com.wuw.demo.domain.VipCard;
import com.wuw.demo.service.VipCardService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: VipCardController
 * @Package com.wuw.demo.controller
 * @Description:
 * @author: WUW
 * @date: 2019/4/1 21:59
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
@RestController
@ComponentScan("packageUrl")
public class VipCardController {

    @Autowired
    public VipCardService vipCardService;

    @ApiOperation(value = "创建会员卡",notes = "根据VipCard对象创建会员卡")
    @ApiImplicitParam(name = "vipCard",value = "会员卡详细实体vipCard",required = true,dataType = "VipCard")
    @RequestMapping(value = "/add_card",method = RequestMethod.POST)
    public String addVipCard(@RequestBody VipCard vipCard){

//        VipCard vipCard=new VipCard();
//        vipCard.setVid("13343961803");
//        vipCard.setOwnname("WUW");
//        vipCard.setPhone("13343961803");
//        vipCard.setMoney(100);
//        vipCard.setStatus(Byte.valueOf("1"));
        return  vipCardService.addVipCard(vipCard);
    }
}
