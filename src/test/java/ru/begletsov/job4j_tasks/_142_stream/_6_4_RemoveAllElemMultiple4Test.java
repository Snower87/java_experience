package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _6_4_RemoveAllElemMultiple4Test {
    @Test
    public void test() {
        assertEquals(List.of(1, 2, 3), _6_4_RemoveAllElemMultiple4.retain(List.of(1, 2, 3)));
        assertEquals(List.of(1, 2, 3), _6_4_RemoveAllElemMultiple4.retain(List.of(1, 2, 3, 4)));
        assertEquals(List.of(1, 2, 3, 5), _6_4_RemoveAllElemMultiple4.retain(List.of(1, 2, 3, 4, 5, 8)));
        assertEquals(List.of(), _6_4_RemoveAllElemMultiple4.retain(List.of(4, 8)));
        assertEquals(List.of(), _6_4_RemoveAllElemMultiple4.retain(List.of()));
    }
}