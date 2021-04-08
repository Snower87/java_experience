package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FirstNotEqualsSecond_1_2Test {
    @Test
    public void FirstEqualsSecond(){
        assertThat(FirstNotEqualsSecond_1_2.numEquals(10,10),
                is(true));
    }

    @Test
    public void FirstNotEqualsSecond(){
        assertThat(FirstNotEqualsSecond_1_2.numEquals(10,1),
                is(false));
    }
}