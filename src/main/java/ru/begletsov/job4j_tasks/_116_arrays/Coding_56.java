package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 56. Кодировщик
 * @Описание Нам необходимо зашифровать данные(массив целочисленных значений) поместив закодированные в результирующий
 * массив целочисленных значений. При этом метод принимает 2 параметра:
 *      1. Исходный массив целочисленных значений;
 *      2. Число на кратность которому мы будем проверять каждое значение в массиве.
 * При этом в результирующий массив должен быть помещен остаток от деления каждого элемента массива на второй аргумент
 * реализуемого метода.
 * @author Sergei Begletsov
 * @since 01.05.2021
 * @version 1
 */

public class Coding_56 {
    public static int[] decode(int[] ints, int number) {
        int[] rsl = ints;
        for (int i = 0; i < ints.length; i++) {
            rsl[i] = rsl[i] % number;
        }
        return rsl;
    }
}
