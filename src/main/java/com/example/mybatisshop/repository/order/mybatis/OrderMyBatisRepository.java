package com.example.mybatisshop.repository.order.mybatis;

import com.example.mybatisshop.domain.order.Order;
import com.example.mybatisshop.domain.order.OrderRepository;
import org.springframework.stereotype.Repository;


@Repository
public class OrderMyBatisRepository implements OrderRepository {

    private final OrderMapper orderMapper;

    public OrderMyBatisRepository(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public void save(Order order) {
        orderMapper.save(order);
    }
}
