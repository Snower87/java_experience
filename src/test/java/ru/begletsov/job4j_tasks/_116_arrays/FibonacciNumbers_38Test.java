package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FibonacciNumbers_38Test {
    @Test
    public void checkArrayTrue() {
        int[] data = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        boolean rsl = FibonacciNumbers_38.checkArray(data);
        assertThat(rsl, is(true));
    }

    @Test
    public void checkArrayFalse() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean rsl = FibonacciNumbers_38.checkArray(data);
        assertThat(rsl, is(false));
    }
}