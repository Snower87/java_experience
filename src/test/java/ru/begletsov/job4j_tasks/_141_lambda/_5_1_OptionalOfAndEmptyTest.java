package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class _5_1_OptionalOfAndEmptyTest {
    @Test
    public void whenExists() {
        Assert.assertEquals(
                Optional.of("c"),
                _5_1_OptionalOfAndEmpty.findValue(
                        List.of("a", "b", "c"),
                        "c"
                )
        );
    }

    @Test
    public void whenNotExists() {
        Assert.assertEquals(
                Optional.empty(),
                _5_1_OptionalOfAndEmpty.findValue(
                        List.of("a", "b", "c"),
                        "d"
                )
        );
    }
}