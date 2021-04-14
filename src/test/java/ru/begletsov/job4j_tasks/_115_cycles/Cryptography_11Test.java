package ru.begletsov.job4j_tasks._115_cycles;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class Cryptography_11Test {
    @Test
    public void testCryptho1234() {
        String code = Cryptography_11.code("111100001234");
        assertThat(code, is("########1234"));
    }

    @Test
    public void codeLengthLess4() {
        String code = Cryptography_11.code("123");
        assertThat(code, is("123"));
    }

    @Test
    public void codeEmptyString() {
        String code = Cryptography_11.code("");
        assertThat(code, is("empty"));
    }

    @Test
    public void codeLengthEquals4() {
        String code = Cryptography_11.code("4432");
        assertThat(code, is("4432"));
    }
}