package com.example.mybatisshop.domain.order;


import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderWriter orderWriter;
    private final OrderReader orderReader;

    public OrderService(OrderWriter orderWriter, OrderReader orderReader) {
        this.orderWriter = orderWriter;
        this.orderReader = orderReader;
    }

    public Long save(Long itemId, Long count) {
        return orderWriter.save(itemId, count);
    }

    public OrderWithOrderItems find(Long orderId) {
        return orderReader.find(orderId);
    }
}
