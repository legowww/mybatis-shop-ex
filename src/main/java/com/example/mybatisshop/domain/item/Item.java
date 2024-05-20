package com.example.mybatisshop.domain.item;

public class Item {

    private Long itemId;
    private String itemName;
    private int itemPrice;

    /*
            방법2가지
            1. 기본생성자 + 프로퍼티 네임과 MyBatis 이름 매핑
            2. 시그니처에 맞는 생성자 사용(컬럼 순서대로 삽입됨)
     */
//    public Item(Long itemId, String itemName, int itemPrice) {
//        this.itemId = itemId;
//        this.itemName = itemName;
//        this.itemPrice = itemPrice;
//    }

    public int getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
