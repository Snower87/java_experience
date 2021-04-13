package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MultipliersNumber_8Test {
    @Test
    public void when1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MultipliersNumber_8.out(1);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln
        ));
    }

    @Test
    public void when2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MultipliersNumber_8.out(2);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln +
                        "2" + ln
        ));
    }

    @Test
    public void when6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MultipliersNumber_8.out(6);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln +
                        "2" + ln +
                        "3" + ln +
                        "6" + ln
        ));
    }
}