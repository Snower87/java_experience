package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _5_1_NumberMapTest {
    @Test
    public void test() {
        List<Integer> input = List.of(2, 3, 4);
        List<Integer> expect = List.of(4, 9, 16);
        assertEquals(expect, _5_1_NumberMap.map(input));
    }
}