package com.peya.pp.domain.order;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public Order getOrder(UUID id) {
        return this.orderRepository.getOrder(id);
    }
}
