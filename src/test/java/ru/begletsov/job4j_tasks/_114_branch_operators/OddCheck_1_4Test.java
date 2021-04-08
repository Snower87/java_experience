package ru.begletsov.job4j_tasks._114_branch_operators;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddCheck_1_4Test {
    @Test
    public void test1() {
        assertThat(OddCheck_1_4.check(3),
                CoreMatchers.is(true));
    }

    @Test
    public void test2() {
        assertThat(OddCheck_1_4.check(2),
                CoreMatchers.is(false));
    }
}