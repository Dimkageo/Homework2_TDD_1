package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAdd() {

        // Given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;

        // When
        int result = calculator.add(a, b);

        // Then
        assertEquals(12, result);
    }
    @Test
    public void testSubtract() {

        // Given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;

        // When
        int result = calculator.subtract(a, b);

        // Then
        assertEquals(8, result);
    }
    @Test
    public void testMultiply() {

        // Given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;

        // When
        int result = calculator.multiply(a, b);

        // Then
        assertEquals(20, result);
    }
    @Test
    public void testQuotient() {

        // Given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;

        // When
        int result = calculator.quotient(a, b);

        // Then
        assertEquals(5, result);
    }
    @Test
    public void testQuotientZero() {

        // Given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        // When & Then
        assertThrows(IllegalArgumentException.class, () ->calculator.quotient(a, b));
    }

}