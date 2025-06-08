package ru.zaikin.junittest.annotations;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.zaikin.junittest.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class DisabledCalculatorTest {


    @Disabled("Disabled until bug #40 isnt fixed")
    @Test
    void addTest() {
        Calculator calc = new Calculator();
        int add = calc.add(2, 2);

        assertEquals(4, add);

    }

    @Disabled("ff")
    @Test
    void substractionTest() {
        Calculator calc = new Calculator();
        int substract = calc.subtract(2, 2);

        assertEquals(0, substract);

    }

    @Test
    void multiplyTest() {
        Calculator calc = new Calculator();
        int multiply = calc.multiply(5, 2);

        assertEquals(10, multiply);

    }

}
