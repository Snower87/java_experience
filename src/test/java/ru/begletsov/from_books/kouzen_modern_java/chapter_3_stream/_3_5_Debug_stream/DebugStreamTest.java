package ru.begletsov.from_books.kouzen_modern_java.chapter_3_stream._3_5_Debug_stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class DebugStreamTest {
    @Test
    public void testSumDoublesDivisibleBy3() {
        assertEquals(1554, DebugStream.sumDoublesDivisibleBy3(100, 120));
    }

    @Test
    public void testSumDoublesDivisibleBy3Ver2() {
        assertEquals(1554, DebugStream.sumDoublesDivisibleBy3Ver2(100, 120));
    }

    @Test
    public void testSumDoublesDivisibleBy3WithPeek() {
        assertEquals(1554, DebugStream.sumDoublesDivisibleBy3WithPeek(100, 120));
    }
}