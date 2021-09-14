package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _5_6_BoxedMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                _5_6_BoxedMethod.boxed(new int[] {1, 2, 3})
        );
    }
}