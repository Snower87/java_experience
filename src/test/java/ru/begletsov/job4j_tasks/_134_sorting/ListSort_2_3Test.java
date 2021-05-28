package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListSort_2_3Test {
    @Test
    public void test1() {
        List<String> input = Arrays.asList(null, "a", "b", "c");
        List<String> result = ListSort_2_3.sort(input);
        List<String> expect = Arrays.asList("c", "b", "a", null);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void test2() {
        List<String> input = Arrays.asList(null, null, null, "a", "z");
        List<String> result = ListSort_2_3.sort(input);
        List<String> expect = Arrays.asList("z", "a", null, null, null);
        Assert.assertEquals(expect, result);
    }
}