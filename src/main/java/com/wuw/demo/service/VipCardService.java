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

    /**
     * 添加会员卡
     * @param vipCard
     * @return
     */
    public String addVipCard(VipCard vipCard){
        vipCardMapper.insert(vipCard);
        return "insert success";
    }

    /**
     * 删除会员卡
     */
    public String deleteVipCard(String vid){
        vipCardMapper.deleteByPrimaryKey(vid);
        return "delete success";
    }

    /**
     * 修改会员卡信息
     * @param vipCard
     * @return
     */
    public String updateVipCard(VipCard vipCard){
        vipCardMapper.updateByPrimaryKey(vipCard);
        return "update success";
    }

    /**
     * 通过会员卡号查询余额
     * @param vid
     * @return
     */
    public int selectBalance(String vid){
       VipCard vipCard= vipCardMapper.selectByPrimaryKey(vid);

       return vipCard.getMoney();
    }


}
