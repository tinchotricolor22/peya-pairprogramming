package com.peya.pp.domain.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class OrderServiceTest {
    @InjectMocks
    private OrderService orderService;

    @Mock
    private OrderRepository orderRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetOrder(){
        // given
        UUID expectedUuid = UUID.randomUUID();
        Order expectedOrder = new Order(expectedUuid);
        when(orderRepository.getOrder(any())).thenReturn(expectedOrder);

        // when
        Order responseOrder = orderService.getOrder(expectedUuid);

        // then
        assertThat(responseOrder).isEqualTo(expectedOrder);
    }
}
