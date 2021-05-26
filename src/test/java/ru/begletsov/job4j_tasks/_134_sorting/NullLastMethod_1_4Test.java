package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NullLastMethod_1_4Test {
    @Test
    public void test() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullLastMethod_1_4.nullLast());
        assertEquals(Arrays.asList("1", "2", "3", null), list);
    }
}