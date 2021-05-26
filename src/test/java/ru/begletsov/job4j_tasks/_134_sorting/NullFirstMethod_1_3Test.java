package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NullFirstMethod_1_3Test {
    @Test
    public void test() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullFirstMethod_1_3.nullFirst());
        assertEquals(Arrays.asList(null, "1", "2", "3"), list);
    }
}