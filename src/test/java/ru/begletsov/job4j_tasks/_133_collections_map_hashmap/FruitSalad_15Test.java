package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FruitSalad_15Test {
    @Test
    public void collectData() {
        String[] data = {"car toyota", "car bmw", "car honda", "fruit apple", "fruit banana", "computer acer", "computer asus", "computer ibm"};
        Map<String, List<String>> rsl = FruitSalad_15.collectData(data);
        Map<String, List<String>> expected = Map.of(
                "car", List.of("toyota", "bmw", "honda"),
                "fruit", List.of("apple", "banana"),
                "computer", List.of("acer", "asus", "ibm")
        );
        assertThat(rsl, is(expected));
    }
}