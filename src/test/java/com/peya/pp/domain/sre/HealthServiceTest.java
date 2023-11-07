package com.peya.pp.domain.sre;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HealthServiceTest {
    @Autowired
    private HealthService healthService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testPong(){
        // given
        String expectedResponse = "pong";

        // when
        String response = healthService.pong();

        // then
        assertThat(response).isEqualTo(expectedResponse);
    }
}
