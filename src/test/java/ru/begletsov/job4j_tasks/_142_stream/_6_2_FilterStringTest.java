package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _6_2_FilterStringTest {
    @Test
    public void test() {
        List<String> list = List.of("Abc.java", "abc.java2", "Ab3c");
        assertEquals(List.of("Abc.java"), _6_2_FilterString.filter(list));
    }
}