package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 58. Кратность числа
 * @Описание Метод принимает два параметра:
 * 1. Целочисленное значение num;
 * 2. Массив целочисленных значений ints.
 * Необходимо проверить являются ли все элементы массива ints, делителями числа num, если являются - то метод должен вернуть true.
 * @author Sergei Begletsov
 * @since 02.05.2021
 * @version 1
 */

public class Divider_58 {
    public static boolean check(int num, int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (num % ints[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
