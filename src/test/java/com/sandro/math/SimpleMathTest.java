package com.sandro.math;

import org.junit.jupiter.api.*;

// test[System Under Test]_[Condition or State Change]_[Expected Result]
// Given / Arrange
// When / Act
// Then / Assert

class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void beforeAllMethod(){
        System.out.println("Running beforeAll Method!");
    }

    @AfterAll
    static void afterAllMethod(){
        System.out.println("Running afterAll Method!");
    }

    @BeforeEach
    void beforeAllSetup(){
        System.out.println("Running beforeEach Method!");
        math = new SimpleMath();
    }

    @AfterEach
    void afterEachCleanup(){
        System.out.println("Running afterEach Method!");
    }

    @Test
    @DisplayName("test 6.2 + 2 = 8.2")
    void testSum_WhenSixPointTwoAddedByTwo_ShouldEqualEightPointTwo() {
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber, secondNumber);
        Double expected = 8.2;
        Assertions.assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce " + expected);
        Assertions.assertNotNull(expected);
        System.out.println("Sum!");
    }

    @Test
    @DisplayName("test 6.2 - 2 = 4.2")
    void testSubtraction(){
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 4.2;
        Assertions.assertEquals(expected, actual, () -> firstNumber + "-" + secondNumber + " did not produce " + expected);
        Assertions.assertNotNull(expected);
        System.out.println("Subtraction!");
    }

    @Test
    @DisplayName("test 6.2 * 2 = 12.4")
    void testMultiplication(){
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 12.4;
        Assertions.assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + " did not produce " + expected);
        Assertions.assertNotNull(expected);
        System.out.println("Multiplication!");
    }

    @Test
    @DisplayName("test 6.2 / 2 = 3.1")
    void testDivision(){
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        Double expected = 3.1;
        Assertions.assertEquals(expected, actual, () -> "("+ firstNumber + "/" + secondNumber + ")" + " did not produce " + expected);
        Assertions.assertNotNull(expected);
        System.out.println("Division");
    }

    @Test
    @DisplayName("test mean of 6.2 + 2 = 4.1")
    void testMean(){
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.mean(firstNumber, secondNumber);
        Double expected = 4.1;
        Assertions.assertEquals(expected, actual, () -> "Mean of " + firstNumber + "+" + secondNumber + " did not produce " + expected);
        Assertions.assertNotNull(expected);
        System.out.println("Mean!");
    }

    @Test
    @DisplayName("test square root of 144 = 12")
    void testSquareRoot(){
        double number = 144;
        Double actual = math.squareRoot(number);
        Double expected = 12.0;
        Assertions.assertEquals(expected, actual, () -> "Square root of " + number + " did not produce " + expected);
        Assertions.assertNotNull(expected);
        System.out.println("Square Root!");
    }

}