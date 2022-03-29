package ru.begletsov.codewars_task._8_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleCharTest {
    @Test
    public void sampleTest() {
        assertEquals("SSttrriinngg", DoubleChar.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd", DoubleChar.doubleChar("Hello World"));
        assertEquals("11223344!!__  ", DoubleChar.doubleChar("1234!_ "));
    }
}