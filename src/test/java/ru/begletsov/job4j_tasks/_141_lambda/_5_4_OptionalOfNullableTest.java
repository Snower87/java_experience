package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

public class _5_4_OptionalOfNullableTest {
    @Test
    public void whenNotNull() {
        assertEquals(
                Optional.of("c"),
                _5_4_OptionalOfNullable.findValue(
                        Arrays.asList("a", "b", "c"),
                        "c"
                )
        );
    }

    @Test
    public void whenNull() {
        assertEquals(
                Optional.empty(),
                _5_4_OptionalOfNullable.findValue(
                        Arrays.asList("a", "b", "c", null),
                        null
                )
        );
    }

    @Test
    public void whenAllIsNull() {
        assertEquals(
                Optional.empty(),
                _5_4_OptionalOfNullable.findValue(
                        Arrays.asList(null, null, null, null, null),
                        null
                )
        );
    }
}