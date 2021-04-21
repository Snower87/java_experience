package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeRowsArrays_25Test {
    @Test
    public void test() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, MergeRowsArrays_25.merge(input));
    }

    @Test
    public void test2() {
        int[][] input = {
                {1, 2},
                {3, 4, 5},
                {6}
        };
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, MergeRowsArrays_25.merge(input));
    }

    @Test
    public void test3() {
        int[][] input = {
                {1, 2},
                {},
                {3,4,5}
        };
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, MergeRowsArrays_25.merge(input));
    }
}