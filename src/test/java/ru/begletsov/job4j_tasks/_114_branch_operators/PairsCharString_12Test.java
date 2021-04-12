package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class PairsCharString_12Test {
    @Test
    public void checkTrue() {
        boolean rsl = PairsCharString_12.check("", "");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkTrue1() {
        boolean rsl = PairsCharString_12.check("sparkling", "groups");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkFalse() {
        boolean rsl = PairsCharString_12.check("booking", "grabber");
        assertThat(rsl, is(false));
    }
}