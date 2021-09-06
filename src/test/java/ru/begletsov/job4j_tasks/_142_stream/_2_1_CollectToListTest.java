package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _2_1_CollectToListTest {
    @Test
    public void test() {
        List<Integer> input = List.of(1, 2);
        List<Integer> expect = List.of(1, 2);
        assertEquals(expect, _2_1_CollectToList.collect(input.stream()));
    }
}