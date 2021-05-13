package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GetOrDefault_4Test {
    @Test
    public void whenGetList() {
        List<String> list = List.of("one", "two", "three");
        List<String> second = List.of("four", "five", "six");
        GetOrDefault_4 get = new GetOrDefault_4();
        get.addValue(1, list);
        get.addValue(2, second);
        List<String> value = get.getValue(2);
        assertThat(value, is(second));
    }

    @Test
    public void whenGetListEmpty() {
        List<String> list = List.of("one", "two", "three");
        List<String> second = List.of("four", "five", "six");
        GetOrDefault_4 get = new GetOrDefault_4();
        get.addValue(1, list);
        get.addValue(2, second);
        List<String> value = get.getValue(10);
        assertThat(value, is(new ArrayList<>()));
    }

    @Test
    public void whenAddListWithDuplicateKey() {
        List<String> list = List.of("one", "two", "three");
        List<String> second = List.of("four", "five", "six");
        List<String> third = List.of("seven", "eight", "nine");
        GetOrDefault_4 get = new GetOrDefault_4();
        get.addValue(1, list);
        get.addValue(2, second);
        get.addValue(1, third);
        List<String> value = get.getValue(1);
        assertThat(value, is(list));
    }
}