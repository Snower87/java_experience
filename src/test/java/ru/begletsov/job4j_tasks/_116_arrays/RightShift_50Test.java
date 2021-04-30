package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RightShift_50Test {
    @Test
    public void testWhenShift1() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 1, 2, 3, 4};
        RightShift_50.shift(input, 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testWhenShift2() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {4, 5, 1, 2, 3};
        RightShift_50.shift(input, 2);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testWhenShift5() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        RightShift_50.shift(input, 5);
        assertArrayEquals(expected, input);
    }
}