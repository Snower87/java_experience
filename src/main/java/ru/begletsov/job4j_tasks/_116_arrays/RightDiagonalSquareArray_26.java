package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 26. Получить правую диагональ квадратного массива
 * @Описание Вам дана квадратная матрица. Нужно получить правую диагональ. Правая диагональ это диагональ матрицы,
 * которая идет справа налево. Например, для
 * {
 *      {1, 2},
 *      {3, 4}
 * }
 * правой будет {2, 3}, левой в этом случае будет {1, 4}
 * @author Sergei Begletsov
 * @since 21.04.2021
 * @version 1
 */

public class RightDiagonalSquareArray_26 {
    public static int[] diagonal(int[][] data) {
        //1. Создание массива
        int[] rsl = new int[data.length];
        int indRslt = 0;
        //2. Заполнение массива для правой диагонали
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (col + row == data.length - 1) {
                    rsl[indRslt++] = data[row][col];
                }
            }
        }
        return rsl;
    }
}
