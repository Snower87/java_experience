package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class _2_8_CollectToMapWhenDublicateTest {
    @Test
    public void test() {
        List<Integer> data = List.of(2, 3, 3);
        Map<Integer, Integer> expect = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = _2_8_CollectToMapWhenDublicate.collect(data.stream());
        assertEquals(expect, result);
    }
}