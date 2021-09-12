package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _3_0_CountMethodTest {
    @Test
    public void test() {
        assertEquals(3, _3_0_CountMethod.count(List.of(1, 2, 3).stream()));
    }
}