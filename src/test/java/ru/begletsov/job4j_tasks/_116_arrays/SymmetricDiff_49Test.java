package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricDiff_49Test {
    @Test
    public void test1() {
        assertArrayEquals(new int[] {}, SymmetricDiff_49.diff(new int[] {}, new int[] {}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[] {1}, SymmetricDiff_49.diff(new int[] {1}, new int[] {}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] {1}, SymmetricDiff_49.diff(new int[] {}, new int[] {1}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[] {}, SymmetricDiff_49.diff(new int[] {1}, new int[] {1}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[] {1, 3}, SymmetricDiff_49.diff(new int[] {1, 2}, new int[] {2, 3}));
    }

    @Test
    public void test6() {
        assertArrayEquals(new int[] {1, 2, 3, 4}, SymmetricDiff_49.diff(new int[] {1, 2}, new int[] {3, 4}));
    }
}