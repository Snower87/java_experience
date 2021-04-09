package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicOr_2_2Test {
    @Test
    public void test_minus_num() {
        assertTrue(LogicOr_2_2.check(-3));
    }

    @Test
    public void test_odd_true() {
        assertTrue(LogicOr_2_2.check(3));
    }

    @Test
    public void test_odd_false() {
        assertFalse(LogicOr_2_2.check(4));
    }
}