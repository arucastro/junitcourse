package com.sandro;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
class MethodOrderedRandomlyTest {

    @Test
    public void testA() {
        System.out.println("Running test A");
    }

    @Test
    public void testB() {
        System.out.println("Running test B");
    }

    @Test
    public void testC() {
        System.out.println("Running test C");
    }
}