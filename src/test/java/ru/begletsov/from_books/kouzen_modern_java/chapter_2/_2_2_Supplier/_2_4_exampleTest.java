package ru.begletsov.from_books.kouzen_modern_java.chapter_2._2_2_Supplier;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class _2_4_exampleTest {
    @Test
    public void createListInt() {
        List<Integer> list = (List<Integer>) _2_4_example.createObj(() -> List.of(1, 2, 3));
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertThat(list, is(expected));
    }

    @Test
    public void createString() {
        String str = (String) _2_4_example.createObj(() -> "String test");
        String expected = "String test";
        assertThat(str, is(expected));
    }
}