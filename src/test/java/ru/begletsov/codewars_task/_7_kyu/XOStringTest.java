package ru.begletsov.codewars_task._7_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class XOStringTest {
    @Test
    public void testSomething1() {
        assertEquals(true, XOString.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, XOString.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, XOString.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, XOString.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, XOString.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, XOString.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, XOString.getXO("Xxxxertr34"));
    }
}