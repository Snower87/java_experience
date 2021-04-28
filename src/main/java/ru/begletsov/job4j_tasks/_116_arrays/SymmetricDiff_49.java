package ru.begletsov.job4j_tasks._116_arrays;

import java.util.Arrays;

/**
 * @Задание 49. Симметрическая разность множеств
 * @Описание Симметрическая разность - это такая операция, когда в результирующее множество попадают все элементы из
 * обоих множеств, кроме тех, которые есть и в том и в другом множествах.
 * Ваша задача реализовать эту операцию. Множества заданы в виде массивов.
 * Например:
 *      {1}, {2} => {1, 2}
 *      {1, 2}, {2, 3} => {1, 3}
 *      {1}, {} => {1}
 * @author Sergei Begletsov
 * @since 28.04.2021
 * @version 1
 */

public class SymmetricDiff_49 {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indResalt = 0;
        for (int leftIndex = 0; leftIndex < left.length; leftIndex++) {
            int value = left[leftIndex];
            boolean priznakEquals = false;
            for (int rightIndex = 0; rightIndex < right.length; rightIndex++) {
                if (value == right[rightIndex]) {
                    priznakEquals = true;
                }
                if (rightIndex == right.length - 1 && priznakEquals == false) {
                    rsl[indResalt++] = value;
                }
            }
        }

        for (int rightIndex = 0; rightIndex < right.length; rightIndex++) {
            int value = right[rightIndex];
            boolean priznakEquals = false;
            for (int leftIndex = 0; leftIndex < left.length; leftIndex++) {
                if (value == left[leftIndex]) {
                    priznakEquals = true;
                }
                if (leftIndex == left.length - 1 && priznakEquals == false) {
                    rsl[indResalt++] = value;
                }
            }
        }
        if (right.length == 0) {
            return left;
        }
        if (left.length == 0) {
            return right;
        }
        return Arrays.copyOf(rsl, indResalt);
    }
}
