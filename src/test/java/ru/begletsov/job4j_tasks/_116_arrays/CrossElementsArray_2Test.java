package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CrossElementsArray_2Test {
    @Test
    public void whenHasCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossElementsArray_2.printCrossEl(
                new int[] {1, 3},
                new int[] {2, 1}
        );
        assertThat(out.toString(), is("1" + System.lineSeparator()));
    }

    @Test
    public void whenNotCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossElementsArray_2.printCrossEl(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(out.toString(), is(""));
    }
}