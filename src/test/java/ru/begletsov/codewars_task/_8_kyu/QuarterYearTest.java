package ru.begletsov.codewars_task._8_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuarterYearTest {
    @Test
    public void exampleTests() {
        assertEquals(QuarterYear.quarterOf(2), 1);
        assertEquals(QuarterYear.quarterOf(3), 1);
        assertEquals(QuarterYear.quarterOf(8), 3);
        assertEquals(QuarterYear.quarterOf(11), 4);
    }
}