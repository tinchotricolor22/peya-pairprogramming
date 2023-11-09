package com.peya.pp.domain.order;

import java.util.UUID;

public interface OrderRepository {
    Order getOrder(UUID id);
}
