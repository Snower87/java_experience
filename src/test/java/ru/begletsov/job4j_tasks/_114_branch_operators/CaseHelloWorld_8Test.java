package ru.begletsov.job4j_tasks._114_branch_operators;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CaseHelloWorld_8Test {
    @Test
    public void checkNumberHelloWorld() {
        String s = CaseHelloWorld_8.checkNumber(15);
        assertThat(s, is("Hello, World!!!"));
    }

    @Test
    public void checkNumberHello() {
        String s = CaseHelloWorld_8.checkNumber(9);
        assertThat(s, is("Hello"));
    }

    @Test
    public void checkNumberWorld() {
        String s = CaseHelloWorld_8.checkNumber(25);
        assertThat(s, is("World"));
    }

    @Test
    public void checkNumberDefault() {
        String s = CaseHelloWorld_8.checkNumber(14);
        assertThat(s, is("Operation not support"));
    }
}