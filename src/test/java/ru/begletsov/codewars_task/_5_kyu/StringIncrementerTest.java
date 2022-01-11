package ru.begletsov.codewars_task._5_kyu;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringIncrementerTest {
    @Test
    public void exampleTests() {
        assertThat(StringIncrementer.incrementString("foobar000"), is("foobar001"));
        assertThat(StringIncrementer.incrementString("foobar001"), is("foobar002"));
        assertThat(StringIncrementer.incrementString("foobar99"), is("foobar100"));
        assertThat(StringIncrementer.incrementString("foobar099"), is("foobar100"));
        assertThat(StringIncrementer.incrementString(""), is("1"));
        assertThat(StringIncrementer.incrementString("foo"), is("foo1"));
    }
}