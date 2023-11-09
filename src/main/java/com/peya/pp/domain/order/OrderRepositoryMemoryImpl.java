package com.peya.pp.domain.order;

import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class OrderRepositoryMemoryImpl implements OrderRepository {
    public Order getOrder(UUID id) {
        return new Order(id);
    }
}
