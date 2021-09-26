package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _0_4_ReductionWithTwoArgumentsTest {
    @Test
    public void test() {
        assertEquals(Integer.valueOf(5), _0_4_ReductionWithTwoArguments.collect(List.of()));
        assertEquals(Integer.valueOf(5), _0_4_ReductionWithTwoArguments.collect(List.of(1)));
        assertEquals(Integer.valueOf(10), _0_4_ReductionWithTwoArguments.collect(List.of(1, 2)));
        assertEquals(Integer.valueOf(15), _0_4_ReductionWithTwoArguments.collect(List.of(1, 2, 3)));
    }
}