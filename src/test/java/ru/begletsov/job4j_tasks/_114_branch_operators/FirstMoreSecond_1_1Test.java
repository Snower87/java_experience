package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FirstMoreSecond_1_1Test {
    @Test
    public void whenFirstLess() {
        assertThat(FirstMoreSecond_1_1.check(2, 5),
                is(false));
    }

    @Test
    public void whenFirstGreat() {
        assertThat(FirstMoreSecond_1_1.check(10,3), is(true));
    }
}