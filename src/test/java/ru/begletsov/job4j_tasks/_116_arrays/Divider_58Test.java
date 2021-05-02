package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Divider_58Test {
    @Test
    public void checkTrue() {
        int[] ints = {2, 3, 4};
        boolean check = Divider_58.check(12, ints);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        int[] ints = {1, 2, 3, 6, 9, 11};
        boolean check = Divider_58.check(18, ints);
        assertThat(check, is(false));
    }
}