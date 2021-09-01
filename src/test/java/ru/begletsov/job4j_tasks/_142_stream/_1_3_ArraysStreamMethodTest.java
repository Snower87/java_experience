package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class _1_3_ArraysStreamMethodTest {
    @Test
    public void test123() {
        Integer[] data = {1, 2, 3};
        assertEquals(3, _1_3_ArraysStreamMethod.createStream(data).count());
    }

    @Test
    public void test0() {
        Integer[] data = {};
        assertEquals(0, _1_3_ArraysStreamMethod.createStream(data).count());
    }
}