package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import static ru.begletsov.job4j_tasks._133_collections_map_hashmap.RemoveElements_9.User;

public class RemoveElements_9Test {
    @Test
    public void removeElement() {
        Map<Integer, String> data = new HashMap<>(
                Map.of(
                        1, "name1",
                        2, "name2",
                        3, "name3",
                        4, "name4",
                        5, "name5",
                        6, "name6",
                        7, "name7",
                        8, "name8",
                        9, "name9",
                        10, "name10"
                )
        );
        List<Integer> ids = List.of(1, 5, 8);
        List<User> users = List.of(
                new User(3, "name3"),
                new User(7, "name7"),
                new User(10, "name10")
        );
        Map<Integer, String> rsl = RemoveElements_9.removeElement(data, ids, users);
        Map<Integer, String> expected = Map.of(
                2, "name2",
                4, "name4",
                6, "name6",
                9, "name9"
        );
        assertThat(rsl, is(expected));
    }
}