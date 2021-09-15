package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _7_1_LimitMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("A", "B", "C"),
                _7_1_LimitMethod.firstThree(List.of("A", "B", "C", "D", "E"))
        );
    }
}