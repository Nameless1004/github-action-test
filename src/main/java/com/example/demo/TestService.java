package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class TestService {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }


}
