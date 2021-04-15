package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 7. Максимум из первого и последнего элемента массива
 * @Описание В этом задании продолжим закреплять индексацию в массиве, а также то, что первый элемент имеет индекс 0,
 * а последний имя_массива.length - 1.
 * Вам необходимо реализовать метод, который принимает массив целочисленных значений, сравнивает между собой первый
 * и последний элемент и возвращает максимальное из двух значений.
 * @author Sergei Begletsov
 * @since 16.04.2021
 * @version 1
 */

public class MaxFirstOrLastElementArray_7 {
    public static int getMaxValue(int[] array) {
        int firstElem = array[0];
        int endElem = array[array.length - 1];
        return firstElem > endElem ? firstElem : endElem;
    }
}
