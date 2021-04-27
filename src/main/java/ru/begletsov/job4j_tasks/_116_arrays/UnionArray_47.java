package ru.begletsov.job4j_tasks._116_arrays;

import java.util.Arrays;

/**
 * @Задание 47. Объединение множеств
 * @Описание Объединение множеств это такая операция при которой в результирующее множество попадают элементы, которые есть хотя бы в одном множестве.
 * Ваша задача реализовать эту операцию. Множества заданы в виде массива
 * Например:
 *  {1}, {2} => {1, 2}
 *  {1, 2}, {2} => {1, 2}
 *  {1, 2}, {3} => {1, 2, 3}
 *  {1}, {} => {1}
 * @author Sergei Begletsov
 * @since 27.04.2021
 * @version 1
 */

public class UnionArray_47 {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int indexRslt = 0;  //индекс в массиве rsl
        int indexLeft = 0;  //индекс в массиве left
        int indexRight = 0; //индекс в массиве right

        //формирование основной части
        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] != right[indexRight]) {
                rsl[indexRslt++] = left[indexLeft] < right[indexRight] ? left[indexLeft++] : right[indexRight++];
            } else {
                rsl[indexRslt++] = left[indexLeft];
                indexLeft++;
                indexRight++;
            }
        }

        //формирование остатка
        while (indexLeft < left.length) {
            rsl[indexRslt++] = left[indexLeft++];
        }

        while (indexRight < right.length) {
            rsl[indexRslt++] = right[indexRight++];
        }

        return Arrays.copyOf(rsl, indexRslt);
    }
}
