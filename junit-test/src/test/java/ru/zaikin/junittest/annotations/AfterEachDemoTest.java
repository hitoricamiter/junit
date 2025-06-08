package ru.zaikin.junittest.annotations;

import org.junit.jupiter.api.*;
import ru.zaikin.junittest.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfterEachDemoTest {

    private static Calculator calc;

    @BeforeAll
    static void setUpBeforeTests() {
        calc = new Calculator();
    }

    @AfterAll
    static void setUpAfterTests() {
        calc = null;
        System.out.println("We reseted the calculator");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Method is calling [beforeach]");
    }

    @AfterEach
    void tearDown() {
        //calc = null;
        System.out.println("Method is responsed for reset");
    }



    @DisplayName("Test Addition of Two Numbers")
    @Test
    void addTest() {
        int additional = calc.add(1, 2);

        assertEquals(3, additional);
    }

    @DisplayName("Test Substract of Two Numbers")
    @Test
    void substractTest() {
        int subtract = calc.subtract(2, 2);

        assertEquals(0, subtract);
    }

    @DisplayName("Test Multiply of Two Numbers")
    @Test
    void multiplyTest() {
        int multiply = calc.multiply(2, 2);

        assertEquals(4, multiply);
    }

    @DisplayName("Test Divide of Two Numbers")
    @Test
    void divideTest() {
        int divide = calc.divide(2, 2);

        assertEquals(1, divide);
    }

}
