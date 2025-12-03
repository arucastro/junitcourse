package com.sandro;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Order(2)
class FooBarTest {

    @Test
    void test() {
        //fail("not implemented yet");
        System.out.println("Hello world");
    }
}