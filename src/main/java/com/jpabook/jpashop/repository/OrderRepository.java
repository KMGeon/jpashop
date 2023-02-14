package com.jpabook.jpashop.repository;

import com.jpabook.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {
    private final EntityManager em;

    public void save(Order order){
        em.persist(order);
    }
    public Order findOnd(Long id){
        return em.find(Order.class, id);
    }

//    public List<Order>findAll(){}
    
}
