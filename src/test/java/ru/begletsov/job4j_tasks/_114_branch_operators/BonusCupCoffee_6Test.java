package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class BonusCupCoffee_6Test {
    @Test
    public void test1() {
        assertThat(BonusCupCoffee_6.countCup(7,6), is(8));
    }

    @Test
    public void test2() {
        int rsl = BonusCupCoffee_6.countCup(213, 6);
        assertThat(rsl, is(248));
    }

    @Test
    public void test3() {
        int rsl = BonusCupCoffee_6.countCup(240, 6);
        assertThat(rsl, is(280));
    }
}