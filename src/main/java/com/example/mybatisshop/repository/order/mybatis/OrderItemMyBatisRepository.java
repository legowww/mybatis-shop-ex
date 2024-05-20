package com.example.mybatisshop.repository.order.mybatis;


import com.example.mybatisshop.domain.order.OrderItem;
import com.example.mybatisshop.domain.order.OrderItemRepository;
import com.example.mybatisshop.domain.order.OrderWithOrderItems;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class OrderItemMyBatisRepository implements OrderItemRepository {

    private final OrderItemMapper orderItemMapper;

    public OrderItemMyBatisRepository(OrderItemMapper orderItemMapper) {
        this.orderItemMapper = orderItemMapper;
    }

    @Override
    public void save(Long orderId, Long itemId, Long count, Long price) {
        orderItemMapper.save(orderId, itemId, count, price);
    }

    @Override
    public OrderWithOrderItems findByOrderId(Long orderId) {
        return orderItemMapper.findByOrderId(orderId);
    }
}
