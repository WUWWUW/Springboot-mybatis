package com.wuw.demo.dao;

import com.wuw.demo.domain.VipCard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VipCardMapper {
    int deleteByPrimaryKey(String vid);

    int insert(VipCard record);

    int insertSelective(VipCard record);

    VipCard selectByPrimaryKey(String vid);

    int updateByPrimaryKeySelective(VipCard record);

    int updateByPrimaryKey(VipCard record);
}