package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _6_3_FilterObjectTest {
    @Test
    public void test() {
        List<_6_3_FilterObject.User> users = List.of(
                new _6_3_FilterObject.User("Ivan", 20),
                new _6_3_FilterObject.User("Boris", 19),
                new _6_3_FilterObject.User("Benjamin", 18)
        );
        _6_3_FilterObject.User user = _6_3_FilterObject.filter(users).iterator().next();
        assertEquals("Boris", user.getName());
        assertEquals(19, user.getAge());
    }
}