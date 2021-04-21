package ru.begletsov.job4j_tasks._116_arrays;

import java.util.Arrays;

/**
 * @Задание 23. Переставить две строки в матрице
 * @Описание Вам нужно переставить две строки в матрице, с учетом, что длины строк одинаковые. src, dest это индексы строк
 * Например, на входе
 *                 {1, 2, 3},
 *                 {4, 5, 6}
 * на выходе
 *                 {4, 5, 6},
 *                 {1, 2, 3}
 * @author Sergei Begletsov
 * @since 21.04.2021
 * @version 1
 */

public class SwapRowsTable_23 {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[0].length; i++) {
            int temp = data[0][i];
            data[0][i] = data[1][i];
            data[1][i] = temp;
        }
    }
}
