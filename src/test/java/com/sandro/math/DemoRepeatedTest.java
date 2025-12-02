package com.sandro.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoRepeatedTest {

    SimpleMath math;
    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition " + "{currentRepetition} of {totalRepetitions}")
    @DisplayName("test division by zero")
    void testDivisionByZero(
         RepetitionInfo repetitionInfo,
         TestInfo testInfo
    ) {
        System.out.println("Repetition N° " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());
        //given
        Double number = 10D;
        String expectedMsg = "Cannot divide by zero!";

        ArithmeticException actual = Assertions.assertThrows(ArithmeticException.class, () -> {
            //when
            math.division(number, 0D);
            //then
        }, () -> "Division by zero should Throw an Arithmetic Exception");

        Assertions.assertEquals(expectedMsg, actual.getMessage(), () -> "Unexpected exception message");
    }
}