package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PositiveOrNegative_55Test {
    @Test
    public void checkTrue() {
        int[] data = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean check = PositiveOrNegative_55.check(data);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        int[] data = {-6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean check = PositiveOrNegative_55.check(data);
        assertThat(check, is(false));
    }
}