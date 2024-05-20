package com.example.mybatisshop.domain.order;

import java.util.List;

public class OrderWithOrderItems {

    private Long orderId;
    private OrderStatus status;
    private List<OrderItem> orderItems;


    //JSON 출력을위한 게터
    public Long getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
