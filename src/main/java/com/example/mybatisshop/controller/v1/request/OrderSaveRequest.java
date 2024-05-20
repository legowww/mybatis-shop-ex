package com.example.mybatisshop.controller.v1.request;

public record OrderSaveRequest(
        Long itemId,
        Long count
) {

}
