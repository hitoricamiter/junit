package ru.zaikin.junittest.annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.zaikin.junittest.Calculator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operations Test")
public class CalculatorTest {

    @DisplayName("Test Addition of Two Numbers")
    @Test
     void addTest() {
        Calculator calc = new Calculator();
        int additional = calc.add(1, 2);

        assertEquals(3, additional);
    }

    @DisplayName("Test Substract of Two Numbers")
    @Test
    void substractTest() {
        Calculator calc = new Calculator();
        int subtract = calc.subtract(2, 2);

        assertEquals(0, subtract);
    }

    @DisplayName("Test Multiply of Two Numbers")
    @Test
    void multiplyTest() {
        Calculator calc = new Calculator();
        int multiply = calc.multiply(2, 2);

        assertEquals(4, multiply);
    }

    @DisplayName("Test Divide of Two Numbers")
    @Test
    void divideTest() {
        Calculator calc = new Calculator();
        int divide = calc.divide(2, 2);

        assertEquals(1, divide);
    }

}
