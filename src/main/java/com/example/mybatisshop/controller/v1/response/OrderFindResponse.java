package com.example.mybatisshop.controller.v1.response;

import com.example.mybatisshop.domain.order.OrderWithOrderItems;

public record OrderFindResponse(
        OrderWithOrderItems orderWithOrderItems
) {
}
