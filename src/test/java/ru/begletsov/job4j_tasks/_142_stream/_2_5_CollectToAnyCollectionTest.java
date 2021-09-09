package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _2_5_CollectToAnyCollectionTest {
    @Test
    public void test() {
        List<Integer> data = List.of();
        String expectClass = "java.util.LinkedHashSet";
        String resultClass = _2_5_CollectToAnyCollection.collect(data.stream()).getClass().getName();
        assertEquals(expectClass, resultClass);
    }
}