package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _6_1_FilterNumbersTest {
    @Test
    public void test() {
        assertEquals(List.of(2, 4), _6_1_FilterNumbers.filter(List.of(1, 2, 3, 4)));
    }
}