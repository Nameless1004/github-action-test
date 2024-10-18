package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyClassTest {
    MyClass myClass = new MyClass();

    @Test
    public void t() throws Exception {
        // given
        myClass.method2();
        myClass.someMethod();
        // when

        // then
    }
}