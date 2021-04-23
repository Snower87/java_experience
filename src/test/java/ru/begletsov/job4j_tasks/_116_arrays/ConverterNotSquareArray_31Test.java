package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConverterNotSquareArray_31Test {
    @Test
    public void ConverterNotSquareArray_13() {
        int[][] array = {{1}, {2, 3, 4}};
        int[][] rsl = ConverterNotSquareArray_31.convertInSquareArray(array);
        int[][] expected = {{1, 2}, {3, 4}};
        assertThat(rsl, is(expected));
    }

    @Test
    public void ConverterNotSquareArray_31() {
        int[][] array = {{1}, {2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
        int[][] rsl = ConverterNotSquareArray_31.convertInSquareArray(array);
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 0}, {0, 0, 0, 0}};
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArrayWithout0() {
        int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8}, {9}};
        int[][] rsl = ConverterNotSquareArray_31.convertInSquareArray(array);
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertThat(rsl, is(expected));
    }
}