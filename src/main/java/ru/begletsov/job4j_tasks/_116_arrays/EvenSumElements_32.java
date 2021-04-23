package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 32. Сумма элементов массива - четное число?
 * @Описание Метод принимает массив целочисленных значений. Метод должен определить сумму всех элементов в массиве,
 * проверить значение суммы является ли оно четным числом.
 * @author Sergei Begletsov
 * @since 23.04.2021
 * @version 1
 */

public class EvenSumElements_32 {
    public static boolean checkArray(int[] data) {
        int rslSumm = 0;
        for (int ind = 0; ind < data.length; ind++) {
            rslSumm += data[ind];
        }
        return rslSumm % 2 == 0 ? true : false;
    }
}
