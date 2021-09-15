package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _8_1_DistinctForPrimitiveTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                _8_1_DistinctForPrimitive.collect(new int[] {1, 2, 3, 1, 2, 3})
        );
    }
}