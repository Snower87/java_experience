package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import org.junit.Test;
import ru.begletsov.job4j_tasks._133_collections_map_hashmap.PutIfAbsent_2.User;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PutIfAbsent_2Test {
    @Test
    public void addNewElement() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        PutIfAbsent_2 put = new PutIfAbsent_2(map);
        User user = new User(1, "Name3");
        boolean rsl = put.addNewElement(user);
        assertThat(rsl, is(false));
    }

    @Test
    public void addNewElementTrue() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        PutIfAbsent_2 put = new PutIfAbsent_2(map);
        User user = new User(3, "Name3");
        boolean rsl = put.addNewElement(user);
        assertThat(rsl, is(true));
    }
}