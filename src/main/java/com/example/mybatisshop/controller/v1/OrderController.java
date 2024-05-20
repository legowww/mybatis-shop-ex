package com.example.mybatisshop.controller.v1;


import com.example.mybatisshop.controller.support.ApiResponse;
import com.example.mybatisshop.controller.v1.request.OrderSaveRequest;
import com.example.mybatisshop.controller.v1.response.OrderFindResponse;
import com.example.mybatisshop.controller.v1.response.OrderSaveResponse;
import com.example.mybatisshop.domain.item.Item;
import com.example.mybatisshop.domain.order.OrderService;
import com.example.mybatisshop.domain.order.OrderWithOrderItems;
import com.example.mybatisshop.repository.item.mybatis.ItemMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;


@RestController
public class OrderController {

    private final OrderService orderService;
    private final ItemMapper itemMapper;

    public OrderController(OrderService orderService, ItemMapper itemMapper) {
        this.orderService = orderService;
        this.itemMapper = itemMapper;
    }

    @PostMapping("/api/v1/orders")
    public ResponseEntity<OrderSaveResponse> save(@RequestBody OrderSaveRequest request) {
        Long orderId = orderService.save(request.itemId(), request.count());

        return ResponseEntity
                .created(URI.create("/api/v1/orders/" + orderId))
                .body(new OrderSaveResponse(orderId));
    }

    @GetMapping("/api/v1/orders/{orderId}")
    public ResponseEntity<ApiResponse> find(@PathVariable("orderId") Long orderId) {
        OrderWithOrderItems orderWithOrderItems = orderService.find(orderId);

        return ResponseEntity
                .ok(ApiResponse.ok(new OrderFindResponse(orderWithOrderItems)));
    }


    @GetMapping("/test")
    public ResponseEntity<String> test() {
        Item item = itemMapper.find(1L);


        return ResponseEntity
                .ok(item.toString());
    }
}
