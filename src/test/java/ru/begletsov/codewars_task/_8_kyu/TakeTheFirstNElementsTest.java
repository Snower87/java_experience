package ru.begletsov.codewars_task._8_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class TakeTheFirstNElementsTest {
    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, TakeTheFirstNElements.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }
}