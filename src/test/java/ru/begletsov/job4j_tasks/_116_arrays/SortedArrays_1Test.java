package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class SortedArrays_1Test {
    @Test
    public void whenArraysSorted() {
        assertThat(SortedArrays_1.isSorted(new int[]{0,1,2,3,4,5}), is(true));
    }

    @Test
    public void whenArraysNotSorted() {
        assertThat(SortedArrays_1.isSorted(new int[]{0,1,2,3,4,1}), is(false));
    }
}