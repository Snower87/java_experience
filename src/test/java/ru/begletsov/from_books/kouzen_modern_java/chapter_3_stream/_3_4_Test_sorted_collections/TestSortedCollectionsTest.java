package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_4_Test_sorted_collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class TestSortedCollectionsTest {
    @Test
    public void testSortedCollection() {
        List<String> strings = Arrays.asList(
                "this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        sorted.stream()
                .reduce((prev, curr) -> {
                    assertTrue(prev.length() <= curr.length());
                    return curr;
                });
    }
}