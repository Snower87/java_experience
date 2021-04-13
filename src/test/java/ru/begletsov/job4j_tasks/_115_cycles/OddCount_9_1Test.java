package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddCount_9_1Test {
    @Test
    public void test() {
        assertEquals(1, OddCount_9_1.count(1, 2));
        assertEquals(2, OddCount_9_1.count(1, 3));
        assertEquals(2, OddCount_9_1.count(1, 4));
        assertEquals(3, OddCount_9_1.count(1, 5));
    }
}