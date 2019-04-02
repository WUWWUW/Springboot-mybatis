package com.wuw.demo.controller;

import com.wuw.demo.domain.VipCard;
import com.wuw.demo.service.VipCardService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
@RequestMapping("vip")
public class VipCardController {

    @Autowired
    public VipCardService vipCardService;

    public Map<String,Object> map=new HashMap<>();
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

    @ApiOperation(value = "删除会员卡",notes = "根据vid主键来删除会员卡")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "vid",value = "用户标识",required = true,paramType = "query",dataType = "String")
    )
    @RequestMapping(value = "/delete_card",method = RequestMethod.DELETE)
    public String deleteVipCard(@RequestParam("vid") String vid){
        System.out.println(vid);
        return  vipCardService.deleteVipCard(vid);
    }

    @ApiOperation(value = "修改会员卡信息",notes = "根据vid主键来修改会员卡信息")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "vid",value = "用户标识",required = true,paramType = "query",dataType = "String")
    )
    @RequestMapping(value = "/update_card",method = RequestMethod.POST)
    public String updateVipCard(@RequestBody VipCard vipCard){
       vipCardService.updateVipCard(vipCard);
       return "update success";
    }


    @ApiOperation(value = "根据vid查询会员卡余额",notes = "根据会员卡好查询余额")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "vid",value = "用户标识",required = true,paramType = "query",dataType = "String")
    )
    @RequestMapping(value = "/select_balance",method = RequestMethod.GET)
    public Object selectBalance(@RequestParam(value = "vid") String vid){
       int balance= vipCardService.selectBalance(vid);
       map.clear();
       map.put("money",balance);
       return map;
    }
}
