package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _0_5_MinMethodTest {
    @Test
    public void test1() {
        assertEquals(
                "a",
                _0_5_MinMethod.min(List.of("ccc", "bb", "a"))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "a",
                _0_5_MinMethod.min(List.of("ccc", "a", "ac", "dddd", "bb"))
        );
    }
}