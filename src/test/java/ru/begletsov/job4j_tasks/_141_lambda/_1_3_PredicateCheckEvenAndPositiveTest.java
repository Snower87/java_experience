package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class _1_3_PredicateCheckEvenAndPositiveTest {
    @Test
    public void test() {
        assertTrue(_1_3_PredicateCheckEvenAndPositive.check(2));
        assertFalse(_1_3_PredicateCheckEvenAndPositive.check(-2));
        assertFalse(_1_3_PredicateCheckEvenAndPositive.check(1));
    }
}