package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 51. Выпал из последовательности
 * @Описание Дана возрастающая последовательность чисел. Ваша задача проверить, что все числа идут один за другим,
 * т.е. разница между соседними числами по модулю равно 1. Если это условие нарушается, то вам нужно вернуть число,
 * которое идет вторым при нарушении. В противном случае, вернуть -1
 * Например:
 *      {1, 2, 3} => -1
 *      {1, 3} => 3
 * @author Sergei Begletsov
 * @since 29.04.2021
 * @version 1
 */

public class NoConsecutive_51 {
    public static int find(int[] data) {
        int result = -1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] - data[i - 1] > 1) {
                result = data[i];
                break;
            }
        }
        return result;
    }
}
