package ru.begletsov.job4j_tasks._121_class;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class Foo_1Test {
    @Test
    public void whenCreateFoo() {
        //var foo = new Foo_1();
        Foo_1 foo = new Foo_1();
        assertThat(foo, is(notNullValue()));
    }
}