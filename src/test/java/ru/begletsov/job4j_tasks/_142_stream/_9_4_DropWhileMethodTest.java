package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _9_4_DropWhileMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3, 7, 9),
                _9_4_DropWhileMethod.dropWhile(List.of(3, 2, 1, -1, -2, -5, -10, 9, 7))
        );
    }
}