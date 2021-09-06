package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static ru.begletsov.job4j_tasks._142_stream._2_1_GroupMethod.User;

public class _2_1_GroupMethodTest {
    @Test
    public void test() {
        User u1 = new User(10, "Ivan");
        User u2 = new User(10, "Boris");
        User u3 = new User(15, "Semen");
        User u4 = new User(20, "Petr");
        Map<Integer, List<User>> expect = Map.of(
                10, List.of(u1, u2),
                15, List.of(u3),
                20, List.of(u4)
        );
        assertEquals(expect, _2_1_GroupMethod.groupBy(
                List.of(u1, u2, u3, u4)
        ));
    }
}