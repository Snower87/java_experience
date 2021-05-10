package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Pangram_3Test {
    @Test
    public void checkStringThrueVer1() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram_3.checkString(str);
        assertThat(b, is(true));
    }

    @Test
    public void checkStringFalse() {
        String str = "Love my big sphinx of quartz";
        boolean b = Pangram_3.checkString(str);
        assertThat(b, is(false));
    }

    @Test
    public void checkStringThrueVer2() {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean b = Pangram_3.checkString(str);
        assertThat(b, is(true));
    }

    @Test
    public void checkStringThrueVer3() {
        String str = "The five boxing wizards jump quickly";
        boolean b = Pangram_3.checkString(str);
        assertThat(b, is(true));
    }
}