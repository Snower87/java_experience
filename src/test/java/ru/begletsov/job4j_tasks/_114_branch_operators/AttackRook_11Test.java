package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class AttackRook_11Test {
    @Test
    public void checkTrueA8_E8() {
        boolean check = AttackRook_11.check("A8", "E8");
        assertThat(check, is(true));
    }

    @Test
    public void checkTrueH4_H3() {
        boolean check = AttackRook_11.check("H4", "H3");
        assertThat(check, is(true));
    }

    @Test
    public void checkFalseA1_B2() {
        boolean check = AttackRook_11.check("A1", "B2");
        assertThat(check, is(false));
    }

    @Test
    public void checkFalseF5_C8() {
        boolean check = AttackRook_11.check("F5", "C8");
        assertThat(check, is(false));
    }
}