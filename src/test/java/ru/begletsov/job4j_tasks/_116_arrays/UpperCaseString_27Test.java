package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseString_27Test {
    @Test
    public void test() {
        char[] input = "betta_83@yandex.ru".toCharArray();
        char[] expected = "BETTA_83@YANDEX.RU".toCharArray();
        assertArrayEquals(expected, UpperCaseString_27.toUpperCase(input));
    }

    @Test
    public void test2() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        assertArrayEquals(expect, UpperCaseString_27.toUpperCase(input));
    }
}