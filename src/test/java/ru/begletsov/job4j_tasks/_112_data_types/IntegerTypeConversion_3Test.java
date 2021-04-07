package ru.begletsov.job4j_tasks._112_data_types;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntegerTypeConversion_3Test {
    @Test
    public void testOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerTypeConversion_3.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln +
                        "1" + ln
        ));
    }
}