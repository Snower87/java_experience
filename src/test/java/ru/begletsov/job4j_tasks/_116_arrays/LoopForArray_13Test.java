package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LoopForArray_13Test {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        LoopForArray_13.main(null);
        String ln = System.lineSeparator();
        String expected = "2" + ln + "3" + ln + "4" + ln + "5" + ln;
        assertThat(out.toString(), is(expected));
    }
}