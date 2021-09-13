package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class _4_6_FindFirstMethodTest {
    @Test
    public void test() {
        assertEquals(Optional.empty(), _4_6_FindFirstMethod.first(List.of()));
        assertEquals(Optional.of(1), _4_6_FindFirstMethod.first(List.of(1)));
    }
}