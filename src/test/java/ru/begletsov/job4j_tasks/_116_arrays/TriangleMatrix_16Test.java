package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleMatrix_16Test {
    @Test
    public void whenRows1() {
        int[][] result = {
                {1}
        };
        int[][] result2 = TriangleMatrix_16.rows(1);
        assertArrayEquals(result, TriangleMatrix_16.rows(1));
    }

    @Test
    public void whenRows2() {
        int[][] result = {
                {1}, {2, 3}
        };
        int[][] result2 = TriangleMatrix_16.rows(2);
        assertArrayEquals(result, TriangleMatrix_16.rows(2));
    }

    @Test
    public void whenRows3() {
        int[][] result = {
                {1}, {2, 3}, {4, 5, 6}
        };
        assertArrayEquals(result, TriangleMatrix_16.rows(3));
    }
}