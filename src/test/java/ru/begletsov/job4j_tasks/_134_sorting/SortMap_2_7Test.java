package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class SortMap_2_7Test {
    @Test
    public void test1() {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expect = new TreeMap<>(input);
        Map<Integer, String> result = SortMap_2_7.sort(input);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void test2() {
        Map<Integer, String> input = Map.of(
                5, "5",
                9, "9",
                1, "1",
                10, "10"
        );
        Map<Integer, String> expect = Map.of(
                10, "10",
                9, "9",
                5, "5",
                1, "1"
        );
        Map<Integer, String> result = SortMap_2_7.sort(input);
        Assert.assertEquals(expect, result);
    }
}