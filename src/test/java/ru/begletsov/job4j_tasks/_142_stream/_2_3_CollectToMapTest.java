package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class _2_3_CollectToMapTest {
    @Test
    public void test() {
        List<Integer> data = List.of(2, 3);
        Map<Integer, Integer> expect = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = _2_3_CollectToMap.collect(data.stream());
        assertEquals(expect, result);
    }

    @Test
    public void testStrMethod() {
        List<Integer> data = List.of(2, 3);
        Map<Integer, String> expect = Map.of(
                2, "4",
                3, "9"
        );
        Map<Integer, String> result = _2_3_CollectToMap.collectToStr(data.stream());
        assertEquals(expect, result);
    }
}