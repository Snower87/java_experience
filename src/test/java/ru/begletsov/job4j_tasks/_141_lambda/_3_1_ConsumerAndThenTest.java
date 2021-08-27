package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class _3_1_ConsumerAndThenTest {
    @Test
    public void test() {
        PrintStream out = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer);
        System.setOut(printStream);
        String input = "job4j";
        String expect = String.format("%s%s", input, System.lineSeparator());
        _3_1_ConsumerAndThen.consumer(input).accept(input);
        assertEquals(expect, buffer.toString());
        System.setOut(out);
    }
}