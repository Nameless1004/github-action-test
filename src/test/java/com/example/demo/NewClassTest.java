package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewClassTest {
    NewClass newClass = new NewClass();

    @Test
    public void tt() throws Exception {
        // given
        int a = 20;
        int b = 30;
        newClass.test();
        String test = newClass.test2();
        System.out.println("test = " + test);
        // when

        // then
    }
}