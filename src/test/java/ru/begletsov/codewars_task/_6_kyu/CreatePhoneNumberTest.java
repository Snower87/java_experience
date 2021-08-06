package ru.begletsov.codewars_task._6_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreatePhoneNumberTest {
    @Test
    public void test1() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void test2() {
        assertEquals("(333) 111-1988", CreatePhoneNumber.createPhoneNumber(new int[] {3, 3, 3, 1, 1, 1, 1, 9, 8, 8}));
    }
}