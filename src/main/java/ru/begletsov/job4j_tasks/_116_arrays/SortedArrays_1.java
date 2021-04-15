package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 1. Проверить сортировку массива
 * @Описание Задана числовой массив. Необходимо написать программу, которая проверит, что массив отсортирован по возрастанию.
 * Сортировать массив не нужно!
 * @author Sergei Begletsov
 * @since 15.04.2021
 * @version 1
 */

public class SortedArrays_1 {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i >= 1 && (array[i-1] > array[i])) {
                return false;
            }
        }
        return true;
    }
}
