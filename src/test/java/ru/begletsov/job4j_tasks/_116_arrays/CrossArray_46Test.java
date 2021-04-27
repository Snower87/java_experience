package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrossArray_46Test {
    @Test
    public void test() {
        assertArrayEquals(new int[] {}, CrossArray_46.and(new int[] {1, 2, 3}, new int[] {4, 5}));
        assertArrayEquals(new int[] {1}, CrossArray_46.and(new int[] {1, 2, 3}, new int[] {1, 4, 5}));
        assertArrayEquals(new int[] {4, 5}, CrossArray_46.and(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5}));
    }
}