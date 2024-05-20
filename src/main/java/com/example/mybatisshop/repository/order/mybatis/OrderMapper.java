package com.example.mybatisshop.repository.order.mybatis;


import com.example.mybatisshop.domain.order.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    // 생성된 ID값을 알기 위해서는 VO를 넣어줘서 keyProperty=VO.id 프로퍼티 이름을 적어줘야한다.
    void save(Order order);

    
}
