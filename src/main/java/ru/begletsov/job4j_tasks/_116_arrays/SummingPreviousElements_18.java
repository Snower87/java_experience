package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 18. Суммирования предыдущих значений
 * @Описание Даны целые числа n (> 2), a и b. Сформировать и вывести целочисленный массив размера n,
 * первый элемент которого равен a, второй равен b, а каждый последующий элемент равен сумме всех предыдущих.
 * @author Sergei Begletsov
 * @since 20.04.2021
 * @version 1
 */

public class SummingPreviousElements_18 {
    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        rsl[0] = a;
        rsl[1] = b;
        int sum = 0;
        for (int i = 1; i < rsl.length; i++) {
            sum += rsl[i-1];
            if (i >= 2) {
                rsl[i] = sum;
            }
        }
        return rsl;
    }
}
