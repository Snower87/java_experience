package ru.begletsov.codewars_task._8_kyu;

import java.util.Arrays;

/**
 * @task Enumerable Magic #25 - Take the First N Elements (8 kyu). Codewars Kata
 * Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.
 * If you need help, here's a reference:
 * https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int)
 * @author Sergei Begletsov
 * @since 30.03.2022
 * @version 1
 */

public class TakeTheFirstNElements {
    public static int[] take(int[] arr, int n) {
        return Arrays.stream(arr).limit(n).toArray();
    }
}
