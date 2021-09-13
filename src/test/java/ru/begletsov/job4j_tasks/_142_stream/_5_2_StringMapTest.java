package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _5_2_StringMapTest {
    @Test
    public void test() {
        List<String> input = List.of("One", "Two");
        List<String> expect = List.of("One.java", "Two.java");
        assertEquals(expect, _5_2_StringMap.map(input));
    }
}