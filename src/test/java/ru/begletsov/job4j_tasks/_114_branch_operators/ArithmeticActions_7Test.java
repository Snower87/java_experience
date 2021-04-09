package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArithmeticActions_7Test {
    @Test
    public void selectActionAdded() {
        String action = ArithmeticActions_7.selectAction(5, 10, 15);
        assertThat(action, is("added"));
    }

    @Test
    public void selectActionSubtracted() {
        String action = ArithmeticActions_7.selectAction(10, 5, 5);
        assertThat(action, is("subtracted"));
    }

    @Test
    public void selectActionMultiplied() {
        String action = ArithmeticActions_7.selectAction(3, 5, 15);
        assertThat(action, is("multiplied"));
    }

    @Test
    public void selectActionDivided() {
        String action = ArithmeticActions_7.selectAction(15, 5, 3);
        assertThat(action, is("divided"));
    }

    @Test
    public void selectActionNone() {
        String action = ArithmeticActions_7.selectAction(1, 10, 100);
        assertThat(action, is("none"));
    }
}