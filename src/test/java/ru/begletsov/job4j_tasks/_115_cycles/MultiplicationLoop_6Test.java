package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationLoop_6Test {
    @Test
    public void test() {
        assertEquals(0, MultiplicationLoop_6.mult(0,2));
        assertEquals(2, MultiplicationLoop_6.mult(1, 2));
        assertEquals(6, MultiplicationLoop_6.mult(1, 3));
    }
}