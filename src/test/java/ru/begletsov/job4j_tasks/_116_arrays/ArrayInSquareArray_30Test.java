package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayInSquareArray_30Test {
    @Test
    public void convertArray4Elements() {
        int[] array = {1, 2, 3, 4};
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] rsl = ArrayInSquareArray_30.convertArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertArray7Elements() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};
        int[][] rsl = ArrayInSquareArray_30.convertArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertArray3Elements() {
        int[] array = {1, 2, 3};
        int[][] expected = {{1, 2}, {3, 0}};
        int[][] rsl = ArrayInSquareArray_30.convertArray(array);
        assertThat(rsl, is(expected));
    }
}