package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueName_1Test {
    @Test
    public void collectUniqueName() {
        List<UniqueName_1.User> users = List.of(
                new UniqueName_1.User(1, "name1"),
                new UniqueName_1.User(2, "name2"),
                new UniqueName_1.User(3, "name1"),
                new UniqueName_1.User(4, "name3"),
                new UniqueName_1.User(5, "name5"),
                new UniqueName_1.User(6, "name3")
        );
        int rsl = UniqueName_1.collectUniqueName(users);
        int expected = 4;
        assertThat(rsl, is(expected));
    }
}