package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class _2_2_FunctionSqrtTest {
    @Test
    public void test() {
        assertEquals(2, _2_2_FunctionSqrt.calculate(4), 0.01);
        assertEquals(3, _2_2_FunctionSqrt.calculate(9), 0.01);
    }
}