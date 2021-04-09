package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class ShortCircuitAnd_4Test {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ShortCircuitAnd_4.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "A" + ln
        ));
    }
}