package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _5_4_CharsMethodTest {
    @Test
    public void test() {
        String input = "123";
        List<Character> expect = List.of('1', '2', '3');
        assertEquals(expect, _5_4_CharsMethod.symbols(input));
    }

    @Test
    public void test2() {
        String input = "12+13=25.";
        List<Character> expect = List.of('1', '2', '+', '1', '3', '=', '2', '5', '.');
        assertEquals(expect, _5_4_CharsMethod.symbols(input));
    }
}