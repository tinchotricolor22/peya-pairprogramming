package com.peya.pp.domain.sre;

import org.springframework.stereotype.Service;

@Service
public class StringHealthService implements HealthService {
    public String pong(){
        return "pong";
    }
}
