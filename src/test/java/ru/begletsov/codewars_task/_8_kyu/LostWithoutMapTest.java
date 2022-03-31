package ru.begletsov.codewars_task._8_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class LostWithoutMapTest {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, LostWithoutMap.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, LostWithoutMap.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, LostWithoutMap.map(new int[] {1, 1, 1, 1, 1, 1}));
    }
}