package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class _5_7_FlatMapForPrimitiveTest {
    @Test
    public void test() {
        assertEquals(
                15,
                _5_7_FlatMapForPrimitive.sum(new int[][] {
                        {1, 2, 3},
                        {4, 5}
                })
        );
    }
}