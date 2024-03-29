package ru.begletsov.codewars_task._6_kyu;

import java.util.Arrays;

/**
 * @task Find the unique number (6 kyu). Codewars Kata
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 *
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * It’s guaranteed that array contains at least 3 numbers.
 *
 * The tests contain some very huge arrays, so think about performance.
 * @author Sergei Begletsov
 * @since 11.05.2021
 * @version 1
 */

public class UniqueNumber {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
