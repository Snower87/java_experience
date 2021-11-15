package ru.begletsov.codewars_task._4_kyu;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class BigBigBigPadovanNumberTest {
    @Test
    public void ValueTest1() {
        assertEquals(new BigInteger("1"),BigBigBigPadovanNumber.Get(1));
        assertEquals(new BigInteger("1"),BigBigBigPadovanNumber.Get(2));
        assertEquals(new BigInteger("2"),BigBigBigPadovanNumber.Get(3));
        assertEquals(new BigInteger("2"),BigBigBigPadovanNumber.Get(4));
        assertEquals(new BigInteger("3"),BigBigBigPadovanNumber.Get(5));
    }

    @Test
    public void ValueTest() {
        assertEquals(new BigInteger("1177482265857"),BigBigBigPadovanNumber.Get(100));
    }
}