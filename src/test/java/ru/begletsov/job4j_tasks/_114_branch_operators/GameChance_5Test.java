package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GameChance_5Test {
    @Test
    public void checkGame() {
        int rsl = GameChance_5.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void checkGameIs0() {
        int rsl = GameChance_5.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }
}