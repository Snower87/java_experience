package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class _2_3_FunctionFormulaTest {
    @Test
    public void test() {
        assertEquals(1, _2_3_FunctionFormula.calculate(0), 0.01);
        assertEquals(4, _2_3_FunctionFormula.calculate(1), 0.01);
        assertEquals(9, _2_3_FunctionFormula.calculate(2), 0.01);
    }
}