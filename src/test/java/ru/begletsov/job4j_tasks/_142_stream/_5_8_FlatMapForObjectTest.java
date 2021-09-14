package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _5_8_FlatMapForObjectTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3, 4),
                _5_8_FlatMapForObject.flatMap(List.of(
                        List.of(1, 2),
                        List.of(3, 4)
                ))
        );
    }
}