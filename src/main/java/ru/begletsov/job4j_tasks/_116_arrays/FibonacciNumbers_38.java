package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 38. Числа Фибоначчи
 * @Описание Числа Фибоначчи - это последовательность чисел, в котором каждое число начиная с третьего равно 
 * сумме двух предыдущих. Например:
 * 1, 3, 4, 7, 11, 18, 29, 47, 76....
 * Вам необходимо реализовать метод, который проверит является ли последовательность целочисленных значений, 
 * которая находится во входящем массиве, последовательностью чисел Фибоначчи. Метод должен вернуть true, 
 * если последовательность чисел - числа Фибоначчи. 
 * @author Sergei Begletsov
 * @since 24.04.2021
 * @version 1
 */

public class FibonacciNumbers_38 {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int ind = 2; ind < data.length; ind++) {
            if (data[ind] != data[ind - 1] + data[ind - 2]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
