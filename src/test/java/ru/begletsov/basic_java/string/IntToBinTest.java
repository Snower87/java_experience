package ru.begletsov.basic_java.string;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntToBinTest {
    @Test
    public void testConvert3() {
        String actual = IntToBin.convert(3);
        String expected = "11";
        assertThat(actual, CoreMatchers.is(expected));
    }

    @Test
    public void testConvert13hex() {
        String actual = IntToBin.convertWithLead0(0x13);
        String expected = "00010011";
        assertThat(actual, CoreMatchers.is(expected));
    }
}