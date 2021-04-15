package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CreateSquareArray_10Test {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CreateSquareArray_10.main(null);
        String ln = System.lineSeparator();
        String expected = "1" + ln + "2" + ln + "3" + ln + "4" + ln;
        assertThat(out.toString(), is(expected));
    }
}