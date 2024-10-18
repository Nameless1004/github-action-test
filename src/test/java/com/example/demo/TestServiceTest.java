package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void sum() throws Exception {
        // given

        // when
        int sum = testService.sum(1, 5);

        // then
        assertThat(sum).isEqualTo(6);
    }


    @Test
    public void mul() throws Exception {
        // given

        // when
        int mul = testService.mul(2, 5);

        // then
        assertThat(mul).isEqualTo(10);
    }
}