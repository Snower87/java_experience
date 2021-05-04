package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SplitterList_8Test {
    @Test
    public void split() {
        List<String> left = new ArrayList<>();
        left.add("one");
        left.add("two");
        left.add("three");
        left.add("four");
        left.add("five");
        left.add("six");
        left.add("seven");
        left.add("eight");
        left.add("nine");
        left.add("ten");
        List<String> middle = List.of(
                "one", "two", "four", "five", "seven", "eight", "nine"
        );
        List<String> right = List.of(
                "two", "five", "nine"
        );
        List<String> rsl = SplitterList_8.split(left, middle, right);
        assertThat(rsl, is(List.of("one", "four", "seven", "eight")));
    }
}