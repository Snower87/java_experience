package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class WeeklySalary_10Test {
    @Test
    public void calculateIs400() {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int rsl = WeeklySalary_10.calculate(hours);
        assertThat(rsl, is(400));
    }

    @Test
    public void calculateIs410() {
        int[] hours = {10, 10, 10, 0, 8, 0, 0};
        int rsl = WeeklySalary_10.calculate(hours);
        assertThat(rsl, is(410));
    }

    @Test
    public void calculateIs690() {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = WeeklySalary_10.calculate(hours);
        assertThat(rsl, is(690));
    }
}