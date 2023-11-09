package com.peya.pp.entrypoint.rest;

import com.peya.pp.domain.order.Order;
import com.peya.pp.domain.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping("/order/{id}")
    public ResponseEntity getOrder(@PathVariable String id){
        Order order = this.orderService.getOrder(UUID.fromString(id));
        return ResponseEntity.ok(order);
    }

}
