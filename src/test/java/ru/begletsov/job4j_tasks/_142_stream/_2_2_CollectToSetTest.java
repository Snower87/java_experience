package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class _2_2_CollectToSetTest {
    @Test
    public void test() {
        Set<Integer> input = Set.of(1, 2);
        Set<Integer> expect = Set.of(1, 2);
        assertEquals(expect, _2_2_CollectToSet.collect(input.stream()));
    }
}