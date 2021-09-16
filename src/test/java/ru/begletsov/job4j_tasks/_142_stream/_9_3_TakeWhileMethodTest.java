package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _9_3_TakeWhileMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of(-2, -1),
                _9_3_TakeWhileMethod.takeWhile(List.of(3, 2, 1, 0, -2, -1))
        );
    }
}