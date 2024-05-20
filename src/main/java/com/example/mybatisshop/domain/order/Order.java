package com.example.mybatisshop.domain.order;


public class Order {

    private Long orderId;
    private OrderStatus status;

    public Long getId() {
        return orderId;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", status=" + status +
                '}';
    }
}
