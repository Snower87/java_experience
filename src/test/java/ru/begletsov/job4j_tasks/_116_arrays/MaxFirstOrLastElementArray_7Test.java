package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class MaxFirstOrLastElementArray_7Test {
    @Test
    public void testMaxElem9() {
        int[] in = {9, 2, 3, 1};
        int expected = 9;
        int rsl = MaxFirstOrLastElementArray_7.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueFirstElement() {
        int[] in = {5, 4, 3, 2, 1};
        int expected = 5;
        int rsl = MaxFirstOrLastElementArray_7.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueLastElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 5;
        int rsl = MaxFirstOrLastElementArray_7.getMaxValue(in);
        assertThat(rsl, is(expected));
    }
}