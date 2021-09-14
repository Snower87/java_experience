package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _5_5_MapToIntMethodTest {
    @Test
    public void test() {
        assertEquals(294, _5_5_MapToIntMethod.sum(List.of('a', 'b', 'c')));
    }
}