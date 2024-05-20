package com.example.mybatisshop.domain.item;

public class ItemRepository {

    public static Long getItemPrice(Long itemId) {
        if (itemId == 1L) {
            return 5_000L;
        }

        return 10_000L;

    }
}
