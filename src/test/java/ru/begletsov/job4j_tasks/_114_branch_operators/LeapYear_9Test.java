package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class LeapYear_9Test {
    @Test
    public void checkYearFalse2019() {
        boolean rslt = LeapYear_9.checkYear(2019);
        assertThat(rslt, is(false));
    }

    @Test
    public void checkYearFalse1800() {
        boolean rslt = LeapYear_9.checkYear(1800);
        assertFalse(rslt);
    }

    @Test
    public void checkYearTrue2000() {
        boolean rslt = LeapYear_9.checkYear(2000);
        assertTrue(rslt);
    }

    @Test
    public void checkYearTrue2020() {
        boolean rslt = LeapYear_9.checkYear(2020);
        assertTrue(rslt);
    }
}