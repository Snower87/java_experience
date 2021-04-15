package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 2. Одинаковые элементы для массивов
 * @Описание Заданы два числовых массива.
 * Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.
 * @author Sergei Begletsov
 * @since 15.04.2021
 * @version 1
 */

public class CrossElementsArray_2 {
    public static void printCrossEl(int[] left, int[] right) {
        for (int j = 0; j < left.length; j++) {
            for (int i = 0; i < right.length; i++) {
                if (left[j] == right[i]) {
                    System.out.println(left[j]);
                }
            }
        }
    }
}
