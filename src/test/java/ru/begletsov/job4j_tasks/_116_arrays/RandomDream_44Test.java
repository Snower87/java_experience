package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomDream_44Test {
    @Test
    public void test() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        assertEquals("car", RandomDream_44.random(prizes, 1));
        assertEquals("ticket", RandomDream_44.random(prizes, 2));
        assertEquals("flat", RandomDream_44.random(prizes, 3));
        assertEquals("house", RandomDream_44.random(prizes, 4));

        assertEquals("car", RandomDream_44.random(prizes, 5));
        assertEquals("ticket", RandomDream_44.random(prizes, 6));
        assertEquals("flat", RandomDream_44.random(prizes, 7));
        assertEquals("house", RandomDream_44.random(prizes, 8));

        assertEquals("car", RandomDream_44.random(prizes, 9));
        assertEquals("ticket", RandomDream_44.random(prizes, 10));
        assertEquals("flat", RandomDream_44.random(prizes, 11));
        assertEquals("house", RandomDream_44.random(prizes, 12));
    }
}