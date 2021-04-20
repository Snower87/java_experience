package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthSeria_22Test {
    @Test
    public void test() {
        assertEquals(1, MaxLengthSeria_22.find(new int[] {1}));
        assertEquals(1, MaxLengthSeria_22.find(new int[] {2, 1}));
        assertEquals(2, MaxLengthSeria_22.find(new int[] {1, 2}));
        assertEquals(4, MaxLengthSeria_22.find(new int[] {1, 2, 0, 1, 2, 3}));
        assertEquals(4, MaxLengthSeria_22.find(new int[] {1, 2, 1, 1, 2, 3}));
        assertEquals(1, MaxLengthSeria_22.find(new int[] {3, 2, 1}));
    }
}