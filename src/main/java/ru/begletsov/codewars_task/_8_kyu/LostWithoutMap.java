package ru.begletsov.codewars_task._8_kyu;

import java.util.Arrays;

/**
 * @task Beginner - Lost Without a Map (8 kyu). Codewars Kata
 * Given an array of integers, return a new array with each value doubled.
 * For example:
 * [1, 2, 3] --> [2, 4, 6]
 * @author Sergei Begletsov
 * @since 31.03.2022
 * @version 1
 */

public class LostWithoutMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr)
                .map(i -> i *2)
                .toArray();
    }
}
