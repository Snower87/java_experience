package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 57. Разница между минимумом и максимумом
 * @Описание Метод принимает массив целочисленных значений, при этом это могут быть как положительные значения,
 * так и отрицательные. Необходимо реализовать в методе следующее:
 * 1. Найти максимальное значение в массиве;
 * 2. Найти минимальное значение в массиве;
 * 3. Вернуть разницу между максимальным и минимальным значением в массиве.
 * При этом массив не может быть пустым, поэтому дополнительная проверка, что длина массива больше 0 - не нужна.
 * @author Sergei Begletsov
 * @since 01.05.2021
 * @version 1
 */

public class SubtractMinMax_57 {
    public static int calculate(int[] ints) {
        int min = ints[0];
        int max = ints[0];
        for (int index = 0; index < ints.length; index++) {
            if (ints[index] < min) {
                min = ints[index];
            }
            if (ints[index] > max) {
                max = ints[index];
            }
        }
        return max - min;
    }
}
