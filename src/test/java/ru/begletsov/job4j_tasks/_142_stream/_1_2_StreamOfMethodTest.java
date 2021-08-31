package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class _1_2_StreamOfMethodTest {
    @Test
    public void whenUserStreamMethod() {
        assertEquals("abc",
                _1_2_StreamOfMethod.createStream().map(Object::toString).collect(Collectors.joining()));
    }
}