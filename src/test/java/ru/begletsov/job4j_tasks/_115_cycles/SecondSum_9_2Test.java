package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondSum_9_2Test {
    @Test
    public void test() {
        assertEquals(12, SecondSum_9_2.sum(0, 6));
        assertEquals(1, SecondSum_9_2.sum(1, 2));
        assertEquals(4, SecondSum_9_2.sum(1, 3));
        assertEquals(4, SecondSum_9_2.sum(1, 4));
        assertEquals(9, SecondSum_9_2.sum(1, 5));
    }
}