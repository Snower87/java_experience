package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SubtractMinMax_57Test {
    @Test
    public void calculateIs18() {
        int[] ints = {10, 15, 20, 2, 10, 6};
        int rsl = SubtractMinMax_57.calculate(ints);
        assertThat(rsl, is(18));
    }

    @Test
    public void calculateIs24() {
        int[] ints = {-3, 4, -9, -1, -2, 15};
        int rsl = SubtractMinMax_57.calculate(ints);
        assertThat(rsl, is(24));
    }
}