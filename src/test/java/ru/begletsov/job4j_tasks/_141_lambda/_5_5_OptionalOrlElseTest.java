package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class _5_5_OptionalOrlElseTest {
    @Test
    public void testOptionalEmpty() {
        assertEquals(Integer.valueOf(-1), _5_5_OptionalOrlElse.orElse(Optional.empty()));
    }
    @Test
    public void testOptionalOf1() {
        assertEquals(Integer.valueOf(1), _5_5_OptionalOrlElse.orElse(Optional.of(1)));
    }
}