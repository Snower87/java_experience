package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class _1_7_RangeMethodTest {
    @Test
    public void test() {
        List<Integer> result = _1_7_RangeMethod.createStream(1, 3).boxed().collect(Collectors.toList());
        List<Integer> expect = List.of(1, 2, 3);
        assertEquals(expect, result);
    }
}