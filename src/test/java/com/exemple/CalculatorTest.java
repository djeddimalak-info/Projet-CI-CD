package com.exemple;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calc.addition(2, 3));
        assertEquals(0, calc.addition(-2, 2));
        assertEquals(-5, calc.addition(-2, -3));
    }

    @Test
    public void testSoustraction() {
        assertEquals(1, calc.soustraction(3, 2));
        assertEquals(-4, calc.soustraction(-2, 2));
        assertEquals(0, calc.soustraction(5, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calc.multiplication(2, 3));
        assertEquals(0, calc.multiplication(0, 10));
        assertEquals(-6, calc.multiplication(-2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calc.division(4, 2));
        assertEquals(2.5, calc.division(5, 2));
    }

    @Test
    public void testDivisionParZero() {
        assertThrows(ArithmeticException.class, () -> calc.division(1, 0));
    }
}
