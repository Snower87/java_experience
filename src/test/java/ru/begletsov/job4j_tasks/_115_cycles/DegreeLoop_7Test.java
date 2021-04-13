package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class DegreeLoop_7Test {
    @Test
    public void test() {
        assertEquals(4, DegreeLoop_7.calculate(2, 2));
        assertEquals(9, DegreeLoop_7.calculate(3, 2));
        assertEquals(3, DegreeLoop_7.calculate(3, 1));
        assertEquals(128, DegreeLoop_7.calculate(2, 7));
    }
}