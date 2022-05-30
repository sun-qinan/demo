package com.tedu.mybatis03.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tedu.mybatis03.mapper.ItemMapper;
import com.tedu.mybatis03.pojo.ItemEntity;
import net.sf.jsqlparser.schema.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class Itemcontroller {
    //从spring框架中取数据访问层的对象
    @Autowired
    ItemMapper itemMapper;

    //查询某个分类下的商品
    @RequestMapping("/getItemById")
    //http://localhost:8080/getItemById?categoryId=1
    public List<ItemEntity> getItemById(Integer categoryId){
        //select * from item where category_id=1
        QueryWrapper queryWrapper=new QueryWrapper();
        //eq=equal
        queryWrapper.eq("category_id",categoryId);
        List list = itemMapper.selectList(queryWrapper);
        return list;
    }
}
