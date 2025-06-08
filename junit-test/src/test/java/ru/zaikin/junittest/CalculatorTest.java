package ru.zaikin.junittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void addTest() {

        Calculator calc = new Calculator();
        int actual = calc.add(1, 2);

        assertEquals(3, actual);


    }




}