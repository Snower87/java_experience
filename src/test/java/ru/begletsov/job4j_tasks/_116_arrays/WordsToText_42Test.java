package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordsToText_42Test {
    @Test
    public void testStringHelloWorld() {
        assertEquals("Hello World", WordsToText_42.convert(new String[] {"Hello", "World"}));
    }

    @Test
    public void testStringOneTwoThree() {
        assertEquals("one two three", WordsToText_42.convert(new String[] {"one", "two", "three"}));
    }

    @Test
    public void testStringOne() {
        assertEquals("one", WordsToText_42.convert(new String[] {"one"}));
    }
}