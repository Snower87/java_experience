package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortBySetUsingComparator_2_6Test {
    @Test
    public void test() {
        List<String> input = Arrays.asList("1", "2", "3", "4", "5");
        Set<String> result = SortBySetUsingComparator_2_6.sort(input);
        Set<String> expect = new TreeSet<>(Set.of("5", "4", "3", "2", "1"));
        Assert.assertEquals(expect, result);
    }
}