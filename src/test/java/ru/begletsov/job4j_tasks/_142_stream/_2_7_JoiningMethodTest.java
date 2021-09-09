package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.*;

public class _2_7_JoiningMethodTest {
    @Test
    public void test() {
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(),
                "Prefix",
                "Suffix"
        );
        expect.add("A");
        expect.add("B");
        expect.add("C");
        assertEquals(
                expect.toString(),
                _2_7_JoiningMethod.join(List.of(
                        "A", "B", "C"
                ))
        );
    }
}