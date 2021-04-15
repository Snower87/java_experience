package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class SumElementsArray_6Test {
    @Test
    public void SumFirstAndEndElements6() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 6;
        int rsl = SumElementsArray_6.getSum(in);
        assertThat(rsl, is(6));
    }
}