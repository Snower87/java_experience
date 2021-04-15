package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class SizeConcatArray_4Test {
    @Test
    public void whenMethodSizeArray6() {
        int[] a = {1, 2};
        int[] b = {3, 4, 5, 6};
        int expectedSize = 6;
        int rsl = SizeConcatArray_4.combineSize(a, b);
        assertThat(expectedSize, is(rsl));
    }

    @Test
    public void whenMethodSizeArray0() {
        int[] a = {};
        int[] b = {};
        int expectedSize = 0;
        int rsl = SizeConcatArray_4.combineSize(a, b);
        assertThat(expectedSize, is(rsl));
    }

    @Test
    public void whenMethodReturnResult12() {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8, 9, 10, 11, 12};
        int expected = 12;
        int rsl = SizeConcatArray_4.combineSize(a, b);
        assertThat(expected, is(rsl));
    }
}