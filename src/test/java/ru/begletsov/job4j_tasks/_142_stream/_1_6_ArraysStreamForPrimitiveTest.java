package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class _1_6_ArraysStreamForPrimitiveTest {
    @Test
    public void test() {
        int[] data = {1, 2, 3};
        List<Integer> result = _1_6_ArraysStreamForPrimitive
                .createStream(data).boxed().collect(Collectors.toList());
        List<Integer> expect = List.of(1, 2, 3);
        assertEquals(expect, result);
    }
}