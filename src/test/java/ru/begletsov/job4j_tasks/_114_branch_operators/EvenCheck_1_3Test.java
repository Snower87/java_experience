package ru.begletsov.job4j_tasks._114_branch_operators;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class EvenCheck_1_3Test {
    @Test
    public void EvenCheckSuccess() {
        assertThat(EvenCheck_1_3.check(4), is(true));
    }

    @Test
    public void EvenCheckFailed() {
        assertThat(EvenCheck_1_3.check(13), is(false));
    }
}