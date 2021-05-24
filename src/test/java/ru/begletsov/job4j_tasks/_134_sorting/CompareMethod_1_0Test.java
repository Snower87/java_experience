package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareMethod_1_0Test {
    @Test
    public void testAscending() {
        assertEquals(0, CompareMethod_1_0.ascendingCompare(1, 1));
        assertEquals(-1, CompareMethod_1_0.ascendingCompare(1, 2));
        assertEquals(1, CompareMethod_1_0.ascendingCompare(2, 1));
    }

    @Test
    public void testDescending() {
        assertEquals(0, CompareMethod_1_0.descendingCompare(1, 1));
        assertEquals(1, CompareMethod_1_0.descendingCompare(1, 2));
        assertEquals(-1, CompareMethod_1_0.descendingCompare(2, 1));
    }
}