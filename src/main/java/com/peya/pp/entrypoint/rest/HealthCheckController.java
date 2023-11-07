package com.peya.pp.entrypoint.rest;

import com.peya.pp.domain.sre.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Autowired
    private HealthService healthService;
    @GetMapping("/ping")
    public String ping(){
        return this.healthService.pong();
    }

}
