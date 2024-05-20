package com.example.mybatisshop.domain.order;



public class OrderItem {

    private Long id;
    private Long itemId;
    private Long count;
    private Integer orderPrice;

    //JSON 출력을위한 게터
    public Long getId() {
        return id;
    }

    public Long getItemId() {
        return itemId;
    }

    public Long getCount() {
        return count;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }
}
