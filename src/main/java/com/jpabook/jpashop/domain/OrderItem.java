package com.jpabook.jpashop.domain;

import com.jpabook.jpashop.domain.item.Item;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name = "order_item_id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;//주문 가격
    private int count;//주문수량


}