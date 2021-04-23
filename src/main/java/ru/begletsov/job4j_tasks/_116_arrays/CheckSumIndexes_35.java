package ru.begletsov.job4j_tasks._116_arrays;

import java.util.Arrays;

/**
 * @Задание 35. Исключить элементы из двумерного массива
 * @Описание Необходимо реализовать метод который вернет одномерный массив, который не будет содержать значений 0
 * (необходимо использовать метод Arrays.copyOf()). При этом исходные данными будут следующими:
 *      1. Квадратный двумерный массив целочисленных значений data.
 *      2. Целочисленный элемент sum, который означает сумму индексов в массиве.
 * При этом необходимо чтобы выполнились следующие условия:
 *      1. Если сумма индексов при переборе двумерного массива равна sum, то элемент с такими индексами должен принять значение 0.
 *      2. Выходной одномерный массив не должен содержать значения 0.
 * @author Sergei Begletsov
 * @since 23.04.2021
 * @version 1
 */

public class CheckSumIndexes_35 {
    public static int[] collectNewArray(int[][] data, int sum) {
        int countIndexSum = data[0].length * data.length;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (row + col == sum) {
                    data[row][col] = 0;
                    countIndexSum--;
                }
            }
        }
        int[] rsl = new int[countIndexSum];
        int ind = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (data[row][col] != 0) {
                    rsl[ind++] = data[row][col];
                }
            }
        }
        return rsl;
    }
}
