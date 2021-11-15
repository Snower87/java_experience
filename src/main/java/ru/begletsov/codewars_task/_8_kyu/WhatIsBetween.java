package ru.begletsov.codewars_task._8_kyu;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.IntStream.rangeClosed;

/**
 * @task What is between? (8 kyu). Codewars Kata
 * Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.
 * For example:
 * a = 1
 * b = 4
 * --> [1, 2, 3, 4]
 * @author Sergei Begletsov
 * @since 15.11.2021
 * @version 1
 */

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        //1 Вариант
        //return Stream.iterate(a, i -> i <= b , i -> i + 1).mapToInt(x -> x).toArray();
        //2 Вариант
        return IntStream.rangeClosed(a, b).toArray();
    }
}