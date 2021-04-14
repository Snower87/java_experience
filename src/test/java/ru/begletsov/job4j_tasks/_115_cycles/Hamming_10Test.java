package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class Hamming_10Test {
    @Test
    public void testHammingDist3() {
        assertThat(Hamming_10.checkStrings("111000","000000"), is(3));
    }

    @Test
    public void testHammingDist0() {
        int rsl = Hamming_10.checkStrings("123456789", "123456789");
        assertTrue(rsl == 0);
    }

    @Test
    public void checkStringsIs3() {
        int rsl = Hamming_10.checkStrings("2173896", "2233796");
        assertThat(rsl, is(3));
    }

    @Test
    public void checkStringsIs5() {
        int rsl = Hamming_10.checkStrings("abcde", "bcdef");
        assertThat(rsl, is(5));
    }

    @Test
    public void checkStringsIs0() {
        int rsl = Hamming_10.checkStrings("abcde", "abcde");
        assertThat(rsl, is(0));
    }
}