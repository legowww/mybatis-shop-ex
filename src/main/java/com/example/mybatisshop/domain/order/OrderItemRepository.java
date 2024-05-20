package com.example.mybatisshop.domain.order;

import java.util.List;

public interface OrderItemRepository {

    void save(Long orderId, Long itemId, Long count, Long price);

    OrderWithOrderItems findByOrderId(Long orderId);
}
