package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _4_3_AnyMatchMethodTest {
    @Test
    public void test() {
        assertTrue(_4_3_AnyMatchMethod.check(List.of("academy", "job4j")));
        assertFalse(_4_3_AnyMatchMethod.check(List.of("academy", "university")));
    }
}