package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitSum_9_5Test {
    @Test
    public void test() {
        assertEquals(1, DigitSum_9_5.sum(1));
        assertEquals(3, DigitSum_9_5.sum(12));
        assertEquals(6, DigitSum_9_5.sum(123));
        assertEquals(10, DigitSum_9_5.sum(1234));
        assertEquals(15, DigitSum_9_5.sum(12345));
    }
}