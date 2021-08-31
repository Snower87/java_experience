package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _1_1_StreamMethodTest {
    @Test
    public void whenUserStreamMethod() {
        assertEquals(3, _1_1_StreamMethod.createStream(
                List.of(1, 2, 3)
        ).count());
    }
}