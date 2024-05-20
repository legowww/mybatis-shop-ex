package com.example.mybatisshop.domain.order;

import org.apache.ibatis.annotations.Param;

public interface OrderRepository {

    void save(@Param("order") Order order);
}
