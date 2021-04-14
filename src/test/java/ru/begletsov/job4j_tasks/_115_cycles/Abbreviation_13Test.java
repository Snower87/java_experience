package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class Abbreviation_13Test {
    @Test
    public void collectAbbrevNATO() {
        String s = "North Atlantic Treaty Organization";
        String rsl = Abbreviation_13.collect(s);
        assertThat(rsl, is("NATO"));
    }

    @Test
    public void collectAbbrevCEO() {
        String s = "Chief Executive Officer";
        String rsl = Abbreviation_13.collect(s);
        assertThat(rsl, is("CEO"));
    }

    @Test
    public void collectAbbrevUNO() {
        String s = "United Nations Organization";
        String rsl = Abbreviation_13.collect(s);
        assertThat(rsl, is("UNO"));
    }
}