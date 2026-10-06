package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(4, calc.divide(12, 3));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }
}