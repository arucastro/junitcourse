package com.sandro.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

    SimpleMath math = new SimpleMath();

    @Test
    void testSum() {
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber, secondNumber);
        Double expected = 8.2;
        Assertions.assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce " + expected);
        Assertions.assertNotNull(expected);
    }

    @Test
    void testSubtraction(){
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 4.2;
        Assertions.assertEquals(expected, actual, () -> firstNumber + "-" + secondNumber + " did not produce " + expected);
        Assertions.assertNotNull(expected);
    }

    @Test
    void testMultiplication(){
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 12.4;
        Assertions.assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + " did not produce " + expected);
        Assertions.assertNotNull(expected);
    }

    @Test
    void testDivision(){
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        Double expected = 3.1;
        Assertions.assertEquals(expected, actual, () -> "("+ firstNumber + "/" + secondNumber + ")" + " did not produce " + expected);
        Assertions.assertNotNull(expected);
    }

    @Test
    void testMean(){
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.mean(firstNumber, secondNumber);
        Double expected = 4.1;
        Assertions.assertEquals(expected, actual, () -> "Mean of " + firstNumber + "+" + secondNumber + " did not produce " + expected);
        Assertions.assertNotNull(expected);
    }

    @Test
    void testSquareRoot(){
        double number = 144;
        Double actual = math.squareRoot(number);
        Double expected = 12.0;
        Assertions.assertEquals(expected, actual, () -> "Square root of " + number + " did not produce " + expected);
        Assertions.assertNotNull(expected);
    }

}