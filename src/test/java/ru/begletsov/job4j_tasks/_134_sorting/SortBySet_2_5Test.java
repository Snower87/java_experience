package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortBySet_2_5Test {
    @Test
    public void test() {
        List<String> input = Arrays.asList("5", "4", "3", "2", "1");
        Set<String> result = SortBySet_2_5.sort(input);
        Set<String> expect = new TreeSet<>(Set.of("1", "2", "3", "4", "5"));
        Assert.assertEquals(expect, result);
    }
}