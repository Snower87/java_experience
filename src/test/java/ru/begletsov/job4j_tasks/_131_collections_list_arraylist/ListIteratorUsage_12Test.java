package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListIteratorUsage_12Test {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ListIteratorUsage_12.main(null);
        String ln = System.lineSeparator();
        String expected = "Start iterate..." + ln
                + "one" + ln + "two" + ln + "three" + ln
                + "Change direction iterate..." + ln
                + "three" + ln + "two" + ln + "one" + ln
                + "Finish iterate..." + ln;
        assertThat(out.toString(), is(expected));
    }
}