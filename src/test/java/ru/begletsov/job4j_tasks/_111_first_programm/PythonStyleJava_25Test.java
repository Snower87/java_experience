package ru.begletsov.job4j_tasks._111_first_programm;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PythonStyleJava_25Test {
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PythonStyleJava_25.main(null);
        assertThat(out.toString(), is("Hello, Job4j!" + System.lineSeparator()));
    }
}