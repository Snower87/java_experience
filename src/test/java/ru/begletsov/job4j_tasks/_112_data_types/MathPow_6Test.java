package ru.begletsov.job4j_tasks._112_data_types;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MathPow_6Test {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathPow_6.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "9.0" + ln
        ));
    }
}