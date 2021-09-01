package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class _1_4_StreamIterateTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Integer[] data = {1, 2, 3, 4};
        _1_4_StreamIterate.showArray(data);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln +
                        "3" + ln
        ));
    }
}