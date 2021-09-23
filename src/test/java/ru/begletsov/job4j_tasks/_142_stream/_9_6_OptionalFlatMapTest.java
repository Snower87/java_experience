package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class _9_6_OptionalFlatMapTest {
    @Test
    public void whenExist() {
        assertEquals(
                Optional.of("Hello.java".length()),
                _9_6_OptionalFlatMap.flatMap(
                        List.of("Hello.java", "Hello.js", "Hello.py")
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                Optional.empty(),
                _9_6_OptionalFlatMap.flatMap(
                        List.of("Hello.cpp", "Hello.js", "Hello.py")
                )
        );
    }
}