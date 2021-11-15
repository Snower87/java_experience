package ru.begletsov.codewars_task._8_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateAverageTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, CalculateAverage.find_average(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, CalculateAverage.find_average(new int[]{1, 2, 3}), DELTA);
    }
}