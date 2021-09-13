package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _4_2_AllMatchMethodTest {
    @Test
    public void test() {
        assertTrue(_4_2_AllMatchMethod.check(List.of("1234", "abcd")));
        assertFalse(_4_2_AllMatchMethod.check(List.of("1234", "ab")));
    }
}