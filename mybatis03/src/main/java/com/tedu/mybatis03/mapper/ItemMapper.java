package com.tedu.mybatis03.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tedu.mybatis03.pojo.ItemEntity;
import org.apache.ibatis.annotations.Mapper;
//实体类
@Mapper
public interface ItemMapper extends BaseMapper<ItemEntity> {

}
