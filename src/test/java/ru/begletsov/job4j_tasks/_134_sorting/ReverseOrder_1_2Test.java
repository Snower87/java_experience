package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseOrder_1_2Test {
    @Test
    public void test1() {
        assertEquals(Comparator.reverseOrder(), ReverseOrder_1_2.reverseOrder());
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(212, 324, 435, 566, 133, 100, 121);
        List<Integer> expected = Arrays.asList(566, 435, 324, 212, 133, 121, 100);
        list.sort(Comparator.reverseOrder());
        assertThat(expected, is(list));
    }

    @Test
    public void test3() {
        List<String> values = Arrays.asList("z", "b", "a", "d", "c", "e");
        List<String> expected = Arrays.asList("z", "e", "d", "c", "b", "a");
        values.sort(Comparator.reverseOrder());
        assertThat(expected, is(values));
    }

    @Test
    public void test4() {
        List<String> values = Arrays.asList("z", "b", "a", "d", "c", "e");
        List<String> expected = Arrays.asList("z", "e", "d", "c", "b", "a");
        values.sort(new ReverseOrder_1_2().reverseOrder());
        assertThat(expected, is(values));
    }
}