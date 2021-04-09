package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class LogicAnd_2_1Test {
    @Test
    public void test_num1() {
        assertFalse(LogicAnd_2_1.check(1));
    }

    @Test
    public void test_num34() {
        assertThat(LogicAnd_2_1.check(34), is(true));
    }

    @Test
    public void test_num_min1() {
        assertThat(LogicAnd_2_1.check(-1), is(false));
    }

    @Test
    public void test_num2() {
        assertThat(LogicAnd_2_1.check(2), is(true));
    }

    @Test
    public void test_num3() {
        assertThat(LogicAnd_2_1.check(3), is(false));
    }

    @Test
    public void test_num22() {
        assertThat(LogicAnd_2_1.check(22), is(true));
    }
}