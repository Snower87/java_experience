package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArithmeticProgression_14Test {
    @Test
    public void checkDataIsNotNull() {
        List<Integer> data = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        int rsl = ArithmeticProgression_14.checkData(data);
        assertThat(rsl, is(235));
    }

    @Test
    public void checkDataIsNull() {
        List<Integer> data = List.of(
                1, 6, 11, 15, 21,
                26, 31, 36, 41, 46
        );
        int rsl = ArithmeticProgression_14.checkData(data);
        assertThat(rsl, is(0));
    }
}