package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import java.util.List;

import static ru.begletsov.job4j_tasks._141_lambda._5_6_OptionalOrElseThrow.User;
import static ru.begletsov.job4j_tasks._141_lambda._5_6_OptionalOrElseThrow.UserNotFoundException;

import static org.junit.Assert.*;

public class _5_6_OptionalOrElseThrowTest {
    @Test
    public void whenFound() {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        assertEquals(u3.getLogin(), _5_6_OptionalOrElseThrow.orElseThrow(
                List.of(u1, u2, u3), u3.getLogin()
        ).getLogin());
    }

    @Test(expected = UserNotFoundException.class)
    public void whenNotFound() {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        _5_6_OptionalOrElseThrow.orElseThrow(List.of(u1, u2, u3), "u4");
    }
}