package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapRowsTable_23Test {

    @Test
    public void test() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6}
        };
        SwapRowsTable_23.swap(data, 0, 1);
        assertArrayEquals(
                new int[][] {
                        {4, 5, 6},
                        {1, 2, 3}
                },
                data
        );
    }
}