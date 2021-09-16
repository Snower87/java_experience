package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _9_2_SortedWithComparatorTest {
    @Test
    public void test() {
        assertEquals(
                List.of("c", "b", "a"),
                _9_2_SortedWithComparator.sorted(List.of("a", "b", "c"))
        );
    }
}