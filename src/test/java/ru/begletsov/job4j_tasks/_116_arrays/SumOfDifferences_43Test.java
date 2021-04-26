package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDifferences_43Test {
    @Test
    public void testWhenRsl9() {
        assertEquals(9, SumOfDifferences_43.sum(new int[] {10, 2, 1}));
    }

    @Test
    public void testWhenRsl2() {
        assertEquals(2, SumOfDifferences_43.sum(new int[] {3, 2, 1}));
    }

    @Test
    public void test1WhenRsl4() {
        assertEquals(4, SumOfDifferences_43.sum(new int[] {5, 4, 3, 2, 1}));
    }

    @Test
    public void test2WhenRsl4() {
        assertEquals(4, SumOfDifferences_43.sum(new int[] {5, 3, 1}));
    }
}