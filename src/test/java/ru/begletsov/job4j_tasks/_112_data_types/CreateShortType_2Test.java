package ru.begletsov.job4j_tasks._112_data_types;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CreateShortType_2Test {
    @Test
    public void whenEnter4() {
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        CreateShortType_2.main(null);
        assertThat(out.toString(), is("4" + System.lineSeparator()));
    }

    @Test
    public void whenEnter6() {
        ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        CreateShortType_2.main(null);
        assertThat(out.toString(), is("6" + System.lineSeparator()));
    }
}