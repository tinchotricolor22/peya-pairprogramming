package com.peya.pp.entrypoint.rest;


import com.peya.pp.domain.sre.HealthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class HealthCheckControllerTest {
    @InjectMocks
    private HealthCheckController healthCheckController;

    @Mock
    private HealthService healthService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testPing() {
        // given
        String expectedResponse = "pongTest";
        when(healthService.pong()).thenReturn("pongTest");

        // when
        String response = healthCheckController.ping();

        // then
        assertThat(response).isEqualTo(expectedResponse);
    }
}
