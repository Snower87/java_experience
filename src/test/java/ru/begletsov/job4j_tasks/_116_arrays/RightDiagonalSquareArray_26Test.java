package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RightDiagonalSquareArray_26Test {
    @Test
    public void test() {
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        int[] expected = {2, 3};
        assertArrayEquals(expected, RightDiagonalSquareArray_26.diagonal(input));
    }

    @Test
    public void test2() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {3, 5, 7};
        assertArrayEquals(expected, RightDiagonalSquareArray_26.diagonal(input));
    }
}