package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class SymmetryNumber_12Test {
    @Test
    public void checkTrue1112111() {
        boolean check = SymmetryNumber_12.check(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse123456() {
        boolean check = SymmetryNumber_12.check(123456);
        assertThat(check, is(false));
    }

    @Test
    public void checkFalse123456321() {
        boolean check = SymmetryNumber_12.check(123456321);
        assertThat(check, is(false));
    }
}