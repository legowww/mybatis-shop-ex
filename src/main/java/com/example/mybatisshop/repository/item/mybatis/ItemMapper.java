package com.example.mybatisshop.repository.item.mybatis;


import com.example.mybatisshop.domain.item.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemMapper {

    Item find(@Param("itemId") Long itemId);
}
