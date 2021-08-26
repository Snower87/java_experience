package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class _2_1_FunctionPowTest {
    @Test
    public void test() {
        assertEquals(4, _2_1_FunctionPow.calculate(2), 0.01);
        assertEquals(9, _2_1_FunctionPow.calculate(3), 0.01);
    }
}