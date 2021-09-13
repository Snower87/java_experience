package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class _4_5_TerminalForPrimitiveTest {
    @Test
    public void test() {
        int[] data = {1, 2, 3};
        _4_5_TerminalForPrimitive terminal = new _4_5_TerminalForPrimitive(data);
        assertEquals(3, terminal.count());
        assertEquals(3, terminal.max());
        assertEquals(1, terminal.min());
        assertEquals(6, terminal.sum());
        assertEquals(2, terminal.avg(), 0.01);
    }
}