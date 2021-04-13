package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Print0ToN_1Test {
    @Test
    public void out3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print0ToN_1.out(3);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
        //var expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("1").add("2").toString();
        assertThat(out.toString(), is(expect));
    }

    @Test
    public void out2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print0ToN_1.out(2);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("1").toString();
        assertThat(out.toString(), is(expect));
    }
}