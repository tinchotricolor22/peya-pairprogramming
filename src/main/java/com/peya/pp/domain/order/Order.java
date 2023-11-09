package com.peya.pp.domain.order;


import java.util.UUID;

public class Order {
    private UUID id;

    public Order(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
