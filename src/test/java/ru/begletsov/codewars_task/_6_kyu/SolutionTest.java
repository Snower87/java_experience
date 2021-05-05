package ru.begletsov.codewars_task._6_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testsNotArguments() {
        assertEquals("no one likes this", Solution.whoLikesIt());
    }

    @Test
    public void tests1ArgumentsPeter() {
        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
    }

    @Test
    public void tests2ArgumentsJacobAlex() {
        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
    }

    @Test
    public void tests3ArgumentsMaxJohnMark() {
        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
    }

    @Test
    public void testsMore4Arguments() {
        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}