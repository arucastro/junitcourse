package com.sandro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ArrayTest {
    @Test
    @DisplayName("Array Comparison")
    void testCompare() {
        int[] array1 = {4,5,3,1,2};
        int[] expected = {1,2,3,4,5};

        Arrays.sort(array1);

        Assertions.assertArrayEquals(array1,expected);
    }

    @Test
    @DisplayName("Test sort performance")
    @Timeout(1)
    //@Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void timeoutTest() {
        //performance test
        int[] array = {0,1,2,3,4};

        for (int i=0; i < 1000000; i++){
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
