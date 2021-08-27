package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.*;

public class _4_3_MRPredicateTest {
    @Test
    public void test() {
        Predicate<String> predicate = _4_3_MRPredicate.predicate();
        assertTrue(predicate.test(""));
        assertFalse(predicate.test("a"));
    }
}