package com.example.mybatisshop.domain.order;


import com.example.mybatisshop.domain.item.Item;
import com.example.mybatisshop.domain.item.ItemRepository;
import com.example.mybatisshop.repository.item.mybatis.ItemMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OrderWriter {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final ItemMapper itemMapper;


    public OrderWriter(OrderRepository orderRepository, OrderItemRepository orderItemRepository, ItemMapper itemMapper) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
        this.itemMapper = itemMapper;
    }

    @Transactional
    public Long save(Long itemId, Long count) {
        Order order = new Order();
        orderRepository.save(order);

        System.out.println(order.toString()); //Order{orderId=24, status=null}

        Item item = itemMapper.find(itemId);
        Long totalPrice = item.getItemPrice() * count;

        orderItemRepository.save(order.getId(), itemId, count, totalPrice);

        return order.getId();
    }
}
