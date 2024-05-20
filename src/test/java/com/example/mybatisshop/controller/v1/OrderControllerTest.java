package com.example.mybatisshop.controller.v1;

import com.example.mybatisshop.domain.order.OrderService;
import com.example.mybatisshop.domain.order.OrderWithOrderItems;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;


@WebMvcTest(OrderService.class)
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderService orderService;




    @Test
    @DisplayName("")
    void test() {
        //given
        given(orderService.find(any())).willReturn(null);
        //when


        //then
//        Assertions.assertThat(orderWithOrderItems).isNotNull();

//        SoftAssertions.assertSoftly(soft -> {
//            soft.assertThat(orderWithOrderItems).isNotNull();
//        });


        assertThatThrownBy(() -> orderService.find(1L))
        .isInstanceOf(NullPointerException.class);
    }

}
