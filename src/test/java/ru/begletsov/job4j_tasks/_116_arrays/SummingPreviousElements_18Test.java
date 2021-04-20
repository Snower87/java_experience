package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummingPreviousElements_18Test {
    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3}, SummingPreviousElements_18.calculate(1, 2, 3));
        assertArrayEquals(new int[] {1, 2, 3, 6}, SummingPreviousElements_18.calculate(1, 2, 4));
        assertArrayEquals(new int[] {1, 2, 3, 6, 12}, SummingPreviousElements_18.calculate(1, 2, 5));
    }
}