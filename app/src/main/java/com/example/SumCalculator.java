package com.example;

public class SumCalculator {
    public int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be non-negative");
        }
        return n * (n + 1) / 2;
    }
}
