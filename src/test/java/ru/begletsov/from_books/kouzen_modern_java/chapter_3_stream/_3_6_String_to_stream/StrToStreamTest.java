package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_6_String_to_stream;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StrToStreamTest {
    private StrToStream demo = new StrToStream();

    @Test
    public void isPalindromeJava7() throws Exception {
        assertTrue(
                Stream.of("Madam, in Eden, I’m Adam",
                        "Go hang a salami; I’m a lasagna hog",
                        "Flee to me, remote elf!",
                        "A Santa pets rats as Pat taps a star step at NASA")
                        .allMatch(demo::isPalindrome7));
        assertFalse(demo.isPalindrome7("Это НЕ палиндром"));
    }

    @Test
    public void isPalindromeJava8() throws Exception {
        assertTrue(
                Stream.of("Madam, in Eden, I’m Adam",
                        "Go hang a salami; I’m a lasagna hog",
                        "Flee to me, remote elf!",
                        "A Santa pets rats as Pat taps a star step at NASA")
                        .allMatch(demo::isPalindrome8));
        assertFalse(demo.isPalindrome8("Это НЕ палиндром"));
    }
}