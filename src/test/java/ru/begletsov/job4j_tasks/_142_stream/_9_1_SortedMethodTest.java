package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _9_1_SortedMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("a", "b", "c"),
                _9_1_SortedMethod.sorted(List.of("c", "b", "a"))
        );
    }
}