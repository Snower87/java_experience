package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 24. Переставить два столбца в матрице
 * @Описание Ваша задача переставить два столбца в квадратной матрице. src, dest это индексы столбцов
 * Например, на входе
 *                 {1, 2, 3},
 *                 {4, 5, 6},
 *                 {7, 8, 9}
 * на выходе
 *                 {3, 2, 1},
 *                 {6, 5, 4},
 *                 {9, 8, 7}
 * @author Sergei Begletsov
 * @since 21.04.2021
 * @version 1
 */

public class SwapColsTable_24 {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[0].length; i++) {
            int temp = data[i][0];
            data[i][0] = data[i][2];
            data[i][2] = temp;
        }
    }
}
