package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Isogram_6Test {
    @Test
    public void checkStringTrue() {
        String s = "uncopyrightables";
        boolean b = Isogram_6.checkString(s);
        assertThat(b, is(true));
    }

    @Test
    public void checkStringFalse() {
        String s = "javascript";
        boolean b = Isogram_6.checkString(s);
        assertThat(b, is(false));
    }
}