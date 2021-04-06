package ru.begletsov.job4j_tasks._111_first_programm;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OutputWithoutNewLine_33Test {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OutputWithoutNewLine_33.main(null);
        assertThat(out.toString(), is("Сегодня я молодец!"));
    }
}