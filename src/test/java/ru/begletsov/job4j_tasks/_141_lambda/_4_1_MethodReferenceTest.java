package ru.begletsov.job4j_tasks._141_lambda;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class _4_1_MethodReferenceTest {
    @Test
    public void whenByClass() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        _4_1_MethodReference.applyByClass();
        assertEquals("From class: Hello", buffer.toString());
        System.setOut(before);
    }

    @Test
    public void whenByInstance() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        new _4_1_MethodReference().applyByInstance();
        assertEquals("From instance: Hello", buffer.toString());
        System.setOut(before);
    }
}