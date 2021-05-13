package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class KeySet_3Test {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        KeySet_3.main(null);
        String ln = System.lineSeparator();
        String expected = "1 - root@root" + ln
                + "2 - local@local" + ln
                + "3 - host@host" + ln;
        assertThat(out.toString(), is(expected));
    }
}