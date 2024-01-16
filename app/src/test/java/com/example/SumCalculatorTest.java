package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumWithPositiveInput() {
        assertEquals(1, sumCalculator.sum(1));
        assertEquals(6, sumCalculator.sum(3));
        assertEquals(15, sumCalculator.sum(5));
    }

    @Test
    void testSumWithZeroInput() {
        assertEquals(0, sumCalculator.sum(0));
    }

    @Test
    void testSumWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(-1));
    }
}
