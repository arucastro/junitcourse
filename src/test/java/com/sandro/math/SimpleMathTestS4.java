package com.sandro.math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

// test[System Under Test]_[Condition or State Change]_[Expected Result]
// Given / Arrange
// When / Act
// Then / Assert

class SimpleMathTestS4 {

    SimpleMath math;

    @BeforeEach
    void beforeAllSetup() {
        math = new SimpleMath();
    }

    //@MethodSource("testDivisionInputParameters")
    @DisplayName("Test Parameterized Division")
    @ParameterizedTest
    @MethodSource()
    void testDivision(double firstNumber, double secondNumber, double expected) {

        Double actual = math.division(firstNumber, secondNumber);

        Assertions.assertEquals(expected, actual, 2D, () -> "(" + firstNumber + "/" + secondNumber + ")" + " did not produce " + expected);

    }

    //public static Stream<Arguments> testDivisionInputParameters() {
    public static Stream<Arguments> testDivision() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3D, 3.1D, 5.9D)
        );
    }

}