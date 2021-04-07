package ru.begletsov.job4j_tasks._112_data_types;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class MathSqrt_7Test {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathSqrt_7.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "3.0" + ln
        ));
    }
}