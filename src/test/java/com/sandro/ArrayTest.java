package com.sandro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    @DisplayName("Array Comparison")
    void testCompare() {
        int[] array1 = {4,5,3,1,2};
        int[] expected = {1,2,3,4,5};

        Arrays.sort(array1);

        Assertions.assertArrayEquals(array1,expected);
    }
}
