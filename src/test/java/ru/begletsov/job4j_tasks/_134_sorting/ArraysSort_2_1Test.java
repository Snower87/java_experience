package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysSort_2_1Test {
    @Test
    public void test1() {
        long[] data = {3, 2, 1};
        long[] result = ArraysSort_2_1.sort(data);
        long[] expect = {1, 2, 3};
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void test2() {
        long[] data = {1, 100, 1000, 500, 400, 900};
        long[] result = ArraysSort_2_1.sort(data);
        long[] expect = {1, 100, 400, 500, 900, 1000};
        Assert.assertArrayEquals(expect, result);
    }
}