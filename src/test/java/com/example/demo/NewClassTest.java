package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewClassTest {
    NewClass newClass = new NewClass();

    @Test
    public void tt() throws Exception {
        // given
        newClass.test();
        String test = newClass.test(5);
        System.out.println("test = " + test);
        // when

        // then
    }
}