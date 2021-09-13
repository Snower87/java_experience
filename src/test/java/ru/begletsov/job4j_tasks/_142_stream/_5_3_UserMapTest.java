package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class _5_3_UserMapTest {
    @Test
    public void test() {
        List<Integer> ages = List.of(1, 2);
        List<_5_3_UserMap.User> result = _5_3_UserMap.map(ages);
        Iterator<_5_3_UserMap.User> iterator = result.iterator();
        assertEquals(1, iterator.next().getAge());
        assertEquals(2, iterator.next().getAge());
    }
}