package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArraysSortWithObject_2_2Test {
    @Test
    public void test1() {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject_2_2.sort(input);
        String[] expect = {"c", "b", "a"};
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void test2() {
        String[] input = {"z", "b", "a", "d", "c", "e"};
        String[] expected = {"z", "e", "d", "c", "b", "a"};
        String[] result = ArraysSortWithObject_2_2.sort(input);;
        assertThat(expected, is(result));
    }
}