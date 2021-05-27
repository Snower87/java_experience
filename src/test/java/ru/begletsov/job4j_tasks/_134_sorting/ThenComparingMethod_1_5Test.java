package ru.begletsov.job4j_tasks._134_sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

import static ru.begletsov.job4j_tasks._134_sorting.ThenComparingMethod_1_5.User;

public class ThenComparingMethod_1_5Test {
    @Test
    public void test() {
        User user1 = new User("C", 10);
        User user2 = new User("B", 20);
        User user3 = new User("A", 15);
        User user4 = new User("B", 11);
        User user5 = new User("A", 12);
        List<User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        input.sort(ThenComparingMethod_1_5.thenComparing());
        assertEquals(expect, input);
    }
}