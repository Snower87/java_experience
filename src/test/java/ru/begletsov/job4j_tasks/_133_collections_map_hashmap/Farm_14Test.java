package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import static ru.begletsov.job4j_tasks._133_collections_map_hashmap.Farm_14.Animal;

public class Farm_14Test {
    @Test
    public void sumLegs() {
        Map<Animal, Integer> data = Map.of(
                new Animal("chicken", 2), 5,
                new Animal("cow", 4), 2,
                new Animal("pig", 4), 8
        );
        int rsl = Farm_14.sumLegs(data);
        assertThat(rsl, is(50));
    }
}