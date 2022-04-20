package ru.begletsov.codewars_task._8_kyu;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class StringyStringsTest {
    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', StringyStrings.stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 1; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, StringyStrings.stringy(size).length());
        }
    }

    @Test
    public void testsAtLength2() {
        assertEquals("1010", StringyStrings.stringy(4));
    }

    @Test
    public void testsAtLength3() {
        assertEquals("101", StringyStrings.stringy(3));
    }
}