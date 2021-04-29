package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoConsecutive_51Test {
    @Test
    public void test1() {
        assertEquals(-1, NoConsecutive_51.find(new int[] {1, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(-1, NoConsecutive_51.find(new int[] {}));
    }

    @Test
    public void test3() {
        assertEquals(3, NoConsecutive_51.find(new int[] {1, 3}));
    }

    @Test
    public void test4() {
        assertEquals(3, NoConsecutive_51.find(new int[] {1, 3, 4, 5}));
    }

    @Test
    public void test5() {
        assertEquals(-1, NoConsecutive_51.find(new int[] {1, 2, 3, 4, 5}));
    }
}