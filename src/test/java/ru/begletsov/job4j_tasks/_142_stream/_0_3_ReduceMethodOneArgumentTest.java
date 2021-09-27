package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _0_3_ReduceMethodOneArgumentTest {
    @Test
    public void test() {
        assertEquals(Integer.valueOf(1), _0_3_ReduceMethodOneArgument.reduce(List.of(1)));
        assertEquals(Integer.valueOf(6), _0_3_ReduceMethodOneArgument.reduce(List.of(1, 2, 3)));
        assertEquals(Integer.valueOf(24), _0_3_ReduceMethodOneArgument.reduce(List.of(1, 2, 3, 4)));
    }
}