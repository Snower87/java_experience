package ru.begletsov.codewars_task._8_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhatIsBetweenTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, WhatIsBetween.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, WhatIsBetween.between(-2, 2));
    }
}