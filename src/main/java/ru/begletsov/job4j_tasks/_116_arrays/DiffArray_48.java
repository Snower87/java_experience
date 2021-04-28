package ru.begletsov.job4j_tasks._116_arrays;

import java.util.Arrays;

/**
 * @Задание 48. Разность первого и второго множества
 * @Описание Разность множеств это операция при которой в результирующее множество попадают элементы из первого множества,
 *  но только если их нет во втором множестве.
 * Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов
 * Например:
 *  {1}, {2} => {1}
 *  {1}, {1} => {}
 *  {1, 2}, {2} => {1}
 *  {1}, {} => {1}
 * @author Sergei Begletsov
 * @since 28.04.2021
 * @version 1
 */

public class DiffArray_48 {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int indResalt = 0;
        for (int leftIndex = 0; leftIndex < left.length; leftIndex++) {
            int value = left[leftIndex];
            boolean priznakEquals = false;
            for (int rightIndex = 0; rightIndex < right.length; rightIndex++) {
                if (value == right[rightIndex]) {
                    break;
                }
                if (rightIndex == right.length - 1 && priznakEquals == false) {
                    rsl[indResalt++] = value;
                }
            }
            if (right.length == 0) {
                rsl[indResalt++] = value;
            }
        }
        return Arrays.copyOf(rsl, indResalt);
    }
}
