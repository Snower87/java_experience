package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class SectionCount_9_3Test {
    @Test
    public void test() {
        assertEquals(0, SectionCount_9_3.count(1,3));
        assertEquals(1, SectionCount_9_3.count(3,2));
        assertEquals(2, SectionCount_9_3.count(2, 1));
        assertEquals(1, SectionCount_9_3.count(3, 2));
        assertEquals(2, SectionCount_9_3.count(4, 2));
    }
}