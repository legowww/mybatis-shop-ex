package com.example.mybatisshop.domain.order;


import org.springframework.stereotype.Component;

@Component
public class OrderReader {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;


    public OrderReader(OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    public OrderWithOrderItems find(Long orderId) {
        return orderItemRepository.findByOrderId(orderId);
    }
}
