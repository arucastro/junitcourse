package com.sandro.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(6.2D, 2D);
        Double expected = 8.2;
        Assertions.assertEquals(expected, actual);
    }
}