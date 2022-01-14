package ru.begletsov.codewars_task._7_kyu;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PasswordMakerTest {
    @Test
    public void basicTest() {
        String a1 = "Give me liberty or give me death";
        String a2 = "Keep Calm and Carry On";
        assertThat(PasswordMaker.makePassword(a1), is("Gml0gmd"));
        String a3 = PasswordMaker.makePassword(a2);
        assertThat(PasswordMaker.makePassword(a2), is("KCaC0"));
        assertThat(PasswordMaker.makePassword(""), is(""));
    }
}