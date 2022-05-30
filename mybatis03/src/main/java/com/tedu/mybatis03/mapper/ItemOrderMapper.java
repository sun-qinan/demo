package com.tedu.mybatis03.mapper;
//数据访问层

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tedu.mybatis03.pojo.ItemOrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemOrderMapper extends BaseMapper<ItemOrderEntity> {

}
