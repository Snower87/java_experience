package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _0_1_CollectorClassTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                _0_1_CollectorClass.collect(List.of(1, 2, 3))
        );
    }
}