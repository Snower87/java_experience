package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _8_2_DistinctForObjectTest {
    @Test
    public void test() {
        _8_2_DistinctForObject.User user1 = new _8_2_DistinctForObject.User("A", 20);
        _8_2_DistinctForObject.User user2 = new _8_2_DistinctForObject.User("B", 20);
        _8_2_DistinctForObject.User user3 = new _8_2_DistinctForObject.User("A", 21);
        _8_2_DistinctForObject.User user4 = new _8_2_DistinctForObject.User("A", 20);
        assertEquals(
                List.of(user1, user2, user3),
                _8_2_DistinctForObject.distinct(List.of(
                        user1, user2, user3, user4
                ))
        );
    }
}