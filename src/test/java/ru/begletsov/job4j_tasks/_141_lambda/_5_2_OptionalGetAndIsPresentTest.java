package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class _5_2_OptionalGetAndIsPresentTest {
    @Test
    public void whenExist() {
        assertEquals(
                1,
                _5_2_OptionalGetAndIsPresent.get(
                        new int[] {1, 2, 3},
                        2
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                -1,
                _5_2_OptionalGetAndIsPresent.get(
                        new int[] {1, 2, 3},
                        4
                )
        );
    }
}