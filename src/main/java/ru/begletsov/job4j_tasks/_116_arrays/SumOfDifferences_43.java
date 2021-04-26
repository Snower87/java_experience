package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 43. Сумма разницы между соседними элементами массива
 * @Описание Дан массив чисел, нужно найти сумму разниц пар элементов
 * Например:
 *      {3, 2, 1} => (3 - 2) + (2 - 1) = 2
 *      {15, 10, 5} => (15 - 10) + (10 - 5) => 10
 * @author Sergei Begletsov
 * @since 26.04.2021
 * @version 1
 */

public class SumOfDifferences_43 {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int ind = 0; ind < nums.length - 1; ind++) {
            sum += nums[ind] - nums[ind + 1];
        }
        return sum;
    }
}
