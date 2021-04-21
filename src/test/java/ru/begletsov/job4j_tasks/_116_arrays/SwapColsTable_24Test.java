package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapColsTable_24Test {
    @Test
    public void test() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SwapColsTable_24.swap(data, 0, 2);
        int[][] expected = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        assertArrayEquals(expected, data);
    }

    @Test
    public void test2() {
        int[][] data = {
                {0, 2, 1},
                {0, 5, 1},
                {0, 8, 1}
        };
        SwapColsTable_24.swap(data, 0, 2);
        int[][] expected = {
                {1, 2, 0},
                {1, 5, 0},
                {1, 8, 0}
        };
        assertArrayEquals(expected, data);
    }
}