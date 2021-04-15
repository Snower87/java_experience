package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IndexMaxElementArray_8Test {
    @Test
    public void getIndexMaxIs4() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 4;
        int rsl = IndexMaxElementArray_8.getIndexMax(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getIndexMaxIs0() {
        int[] in = {5, 4, 3, 2, 1};
        int expected = 0;
        int rsl = IndexMaxElementArray_8.getIndexMax(in);
        assertThat(rsl, is(expected));
    }
}