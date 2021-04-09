package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FindForgottenIfBracket_3_1Test {
    @Test
    public void when2ThenAB() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        FindForgottenIfBracket_3_1.show(2);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "A" + ln +
                        "B" + ln
        ));
    }

    @Test
    public void when0ThenNoOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        FindForgottenIfBracket_3_1.show(0);
        assertThat(out.toString(), is(""));
    }
}