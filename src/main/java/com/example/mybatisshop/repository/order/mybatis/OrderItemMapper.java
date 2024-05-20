package com.example.mybatisshop.repository.order.mybatis;


import com.example.mybatisshop.domain.order.OrderWithOrderItems;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {

    Long save(Long orderId, Long itemId, Long count, Long price);

//    List<OrderItem> findByOrderId(Long orderId);

    //collections
    OrderWithOrderItems findByOrderId(Long orderId);
}
