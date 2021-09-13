package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _4_4_NoneMatchMethodTest {
    @Test
    public void test() {
        assertTrue(_4_4_NoneMatchMethod.check(List.of("1", "2", "3")));
        assertFalse(_4_4_NoneMatchMethod.check(List.of("1", "", "3")));
    }
}