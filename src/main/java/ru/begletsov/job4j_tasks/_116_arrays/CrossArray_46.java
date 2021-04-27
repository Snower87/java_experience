package ru.begletsov.job4j_tasks._116_arrays;

import java.util.Arrays;

/**
 * @Задание 46. Пересечение множеств
 * @Описание Множество - это набор уникальных элементов. Пересечение множеств - это такая операция,
 * когда в результирующее множество попадают только элементы, которые есть в обоих множествах.
 * Если нет такие элементов, то результат пустое множество.
 * Ваша задача реализовать данную операцию в коде. Множества заданы массивами
 *  Например:
 * {1, 2} и {3, 4} => {}, нет общих элементов
 * {1, 2} и {1, 3, 4} => {1}, 1 общий элемент
 * {1, 2} и {1, 2, 3, 4} => {1, 2}, 1 и 2 общие элементы
 * @author Sergei Begletsov
 * @since 27.04.2021
 * @version 1
 */

public class CrossArray_46 {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indRsl = 0;
        for (int leftInd = 0; leftInd < left.length; leftInd++) {
            for (int rightInd = 0; rightInd < right.length; rightInd++) {
                if (left[leftInd] == right[rightInd]) {
                    rsl[indRsl++] = left[leftInd];
                }
            }
        }
        return Arrays.copyOf(rsl, indRsl);
    }
}
