package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class _1_1_PredicateCheckPositiveTest {
    @Test
    public void whenPositive() {
        assertTrue(_1_1_PredicateCheckPositive.check(1));
        assertFalse(_1_1_PredicateCheckPositive.check(-1));
        assertFalse(_1_1_PredicateCheckPositive.check(0));
    }
}