package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _7_2_SkipMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("C", "D", "E"),
                _7_2_SkipMethod.lastThree(List.of("A", "B", "C", "D", "E"))
        );
    }
}