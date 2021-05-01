package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 55. Четное или нечетное количество отрицательных значений
 * @Описание Метод принимает массив целочисленных значений. При этом массив может содержать как положительные значения,
 * так и отрицательные, но не может содержать 0.
 * Необходимо реализовать метод таким образом, чтобы он вернул булево значение следующим образом:
 * 1. true - количество отрицательных значений в массиве нечетное число;
 * 2. false - количество положительных значений в массиве четное число.
 * @author Sergei Begletsov
 * @since 01.05.2021
 * @version 1
 */

public class PositiveOrNegative_55 {
    public static boolean check(int[] data) {
        int countNegative = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                countNegative++;
            }
        }
        if (countNegative % 2 != 0) {
            return true;
        }
        return false;
    }
}
