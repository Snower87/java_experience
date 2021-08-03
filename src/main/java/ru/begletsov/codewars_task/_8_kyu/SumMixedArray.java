package ru.begletsov.codewars_task._8_kyu;

import java.util.Arrays;
import java.util.List;

/**
 * @task Sum Mixed Array (8 kyu). Codewars Kata
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 * Return your answer as a number.
 * @author Sergei Begletsov
 * @since 03.08.2021
 * @version 1
 */

public class SumMixedArray {
    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object obj: mixed) {
            if (obj instanceof String) {
                sum += Integer.parseInt((String) obj);
            } else {
                sum += (Integer) obj;
            }
        }
        return sum;
    }
}
