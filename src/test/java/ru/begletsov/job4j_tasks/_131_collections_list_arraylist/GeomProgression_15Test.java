package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GeomProgression_15Test {
    @Test
    public void generateAndSum() {
        int rsl = GeomProgression_15.generateAndSum(1, 3, 10);
        assertThat(rsl, is(29524));
    }

    @Test
    public void generateAndSumIs0() {
        int rsl = GeomProgression_15.generateAndSum(1, -1, 10);
        assertThat(rsl, is(0));
    }
}