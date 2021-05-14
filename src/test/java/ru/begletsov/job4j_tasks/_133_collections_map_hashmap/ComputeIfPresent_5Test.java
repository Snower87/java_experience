package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ComputeIfPresent_5Test {
    @Test
    public void collectData() {
        Map<Integer, String> name = new HashMap<>(Map.of(1, "Bill", 2, "Donald"));
        Map<Integer, String> surname = new HashMap<>(Map.of(1, "Clinton", 2, "Trump"));
        Map<Integer, String> rsl = ComputeIfPresent_5.collectData(name, surname);
        Map<Integer, String> expected = Map.of(1, "Bill Clinton", 2, "Donald Trump");
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectData2() {
        Map<Integer, String> name = new HashMap<>(Map.of(1, "Leonard", 2, "Jack",3,"Matthew", 4, "Karl"));
        Map<Integer, String> surname = new HashMap<>(Map.of(1, "Lightfoot", 2, "Livingston"));
        Map<Integer, String> rsl = ComputeIfPresent_5.collectData(name, surname);
        Map<Integer, String> expected = Map.of(1, "Leonard Lightfoot", 2, "Jack Livingston", 3,"Matthew", 4, "Karl");
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectData3() {
        Map<Integer, String> name = new HashMap<>(Map.of(1, "Leonard", 2, "Jack",3,"Matthew", 4, "Karl"));
        Map<Integer, String> surname = new HashMap<>(Map.of(1, "Lightfoot", 2, "Livingston", 3, "Ludwinski", 4, "Lukas"));
        Map<Integer, String> rsl = ComputeIfPresent_5.collectData(name, surname);
        Map<Integer, String> expected = Map.of(1, "Leonard Lightfoot", 2, "Jack Livingston", 3,"Matthew Ludwinski", 4, "Karl Lukas");
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectData4() {
        Map<Integer, String> name = new HashMap<>(Map.of(1, "Leonard", 2, "Jack"));
        Map<Integer, String> surname = new HashMap<>(Map.of(1, "Lightfoot", 2, "Livingston", 3, "Ludwinski", 4, "Lukas"));
        Map<Integer, String> rsl = ComputeIfPresent_5.collectData(name, surname);
        Map<Integer, String> expected = Map.of(1, "Leonard Lightfoot", 2, "Jack Livingston");
        assertThat(rsl, is(expected));
    }
}