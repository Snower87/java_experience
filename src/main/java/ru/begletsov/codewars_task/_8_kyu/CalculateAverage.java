package ru.begletsov.codewars_task._8_kyu;

import java.util.Arrays;

/**
 * @task Calculate average (8 kyu). Codewars Kata
 * Write a function which calculates the average of the numbers in a given list. *
 * Note: Empty arrays should return 0.
 * @author Sergei Begletsov
 * @since 15.11.2021
 * @version 2
 */

public class CalculateAverage {
    public static double find_average(int[] array){
        //1 Вариант
        //return array.length == 0 ? 0 : (double) Arrays.stream(array).sum() / array.length;
        //2 Вариант
        //return array.length == 0 ? 0 : (double) Arrays.stream(array).boxed().mapToInt(Integer::intValue).sum() / array.length;
        //3 Вариант
        return Arrays.stream(array).average().orElse(0);
    }
}
