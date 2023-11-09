package com.peya.pp.domain.order;


import java.util.UUID;

/**
 * Order created for the user that represents a request for an order
 */
public class Order {
    private UUID id;

    public Order(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
