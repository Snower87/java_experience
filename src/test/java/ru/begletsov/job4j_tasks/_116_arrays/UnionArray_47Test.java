package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnionArray_47Test {
    @Test
    public void test() {
        assertArrayEquals(new int[] {}, UnionArray_47.or(new int[] {}, new int[] {}));
        assertArrayEquals(new int[] {1}, UnionArray_47.or(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {1}, UnionArray_47.or(new int[] {}, new int[] {1}));
        assertArrayEquals(new int[] {1, 2}, UnionArray_47.or(new int[] {1, 2}, new int[] {1, 2}));
        assertArrayEquals(new int[] {1, 2, 3}, UnionArray_47.or(new int[] {1, 2}, new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {1, 2, 3}, UnionArray_47.or(new int[] {1}, new int[] {2, 3}));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, UnionArray_47.or(new int[] {1, 4, 5}, new int[] {2, 3}));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, UnionArray_47.or(new int[] {1, 2, 3}, new int[] {4, 5}));
    }
}