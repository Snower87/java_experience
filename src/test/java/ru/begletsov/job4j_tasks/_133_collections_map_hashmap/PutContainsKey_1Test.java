package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import ru.begletsov.job4j_tasks._133_collections_map_hashmap.PutContainsKey_1.User;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PutContainsKey_1Test {
    @Test
    public void addNewElement() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> map = PutContainsKey_1.addNewElementWithCheck(list);
        Map<Integer, User> expected = Map.of(1, one, 2, two);
        assertThat(map, is(expected));
    }

    @Test
    public void addNewElementWithoutCheck() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> map = PutContainsKey_1.addNewElementWithoutCheck(list);
        Map<Integer, User> expected = Map.of(1, three, 2, two);
        assertThat(map, is(expected));
    }

    @Test
    public void addNewElement2() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(3, "Name3");
        User four = new User(1, "Name11");
        User five = new User(2, "Name22");
        User six = new User(3, "Name33");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> map = PutContainsKey_1.addNewElementWithCheck(list);
        Map<Integer, User> expected = Map.of(four.getId(), four, five.getId(), five, six.getId(), six);
        assertThat(map, is(expected));
    }

    @Test
    public void addNewElementWithoutCheck2() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(3, "Name3");
        User four = new User(1, "Name11");
        User five = new User(2, "Name22");
        User six = new User(3, "Name33");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> map = PutContainsKey_1.addNewElementWithCheck(list);
        Map<Integer, User> expected = Map.of(one.getId(), one, two.getId(), two, three.getId(), three);
        assertThat(map, is(expected));
    }
}