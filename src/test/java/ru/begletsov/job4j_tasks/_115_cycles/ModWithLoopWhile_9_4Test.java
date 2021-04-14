package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModWithLoopWhile_9_4Test {
    @Test
    public void test() {
        assertEquals(2, ModWithLoopWhile_9_4.mod(8, 3));
        assertEquals(0, ModWithLoopWhile_9_4.mod(4, 2));
        assertEquals(1, ModWithLoopWhile_9_4.mod(3, 2));
        assertEquals(0, ModWithLoopWhile_9_4.mod(0, 3));
    }
}