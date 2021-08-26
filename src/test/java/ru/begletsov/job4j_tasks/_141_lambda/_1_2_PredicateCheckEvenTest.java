package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class _1_2_PredicateCheckEvenTest {
    @Test
    public void test() {
        assertTrue(_1_2_PredicateCheckEven.check(2));
        assertFalse(_1_2_PredicateCheckEven.check(1));
    }
}