package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NaturalOrder_1_1Test {
    @Test
    public void test1() {
        assertEquals(Comparator.naturalOrder(), NaturalOrder_1_1.naturalOrder());
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(212, 324, 435, 566, 133, 100, 121);
        List<Integer> expected = Arrays.asList(100, 121, 133, 212, 324, 435, 566);
        list.sort(Comparator.naturalOrder());
        assertThat(expected, is(list));
    }

    @Test
    public void test3() {
        List<String> values = Arrays.asList("z", "b", "a", "d", "c", "e");
        List<String> expected = Arrays.asList("a", "b", "c", "d", "e", "z");
        values.sort(Comparator.naturalOrder());
        assertThat(expected, is(values));
    }

    @Test
    public void test4() {
        List<String> values = Arrays.asList("z", "b", "a", "d", "c", "e");
        List<String> expected = Arrays.asList("a", "b", "c", "d", "e", "z");
        values.sort(new NaturalOrder_1_1().naturalOrder());
        assertThat(expected, is(values));
    }
}