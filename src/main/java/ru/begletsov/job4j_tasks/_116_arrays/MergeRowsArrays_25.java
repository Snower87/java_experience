package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 25. Объединить строки квадратного массива
 * @Описание Дана квадратная матрица. Ваша задача объединить ее строки в один массив
 * Например, для {{1, 2}, {3, 4}} получить {1, 2, 3, 4}
 * Примечание:
 * Если гарантируется, что все "строки" одинаковой длины, то количество строк (rows) и столбцов (columns) определяется так:
 *      int rows = a.length;
 *      int columns = a[0].length;
 * Без соблюдения этих условий -- никак.
 * @author Sergei Begletsov
 * @since 21.04.2021
 * @version 1
 */

public class MergeRowsArrays_25 {
    public static int[] merge(int[][] data) {
        //1. Считаю сколько элементов в несимметричном массиве
        int arrLength = 0;
        for (int i = 0; i < data.length; i++) {
            arrLength += data[i].length;
        }
        //2. Создаю массив нужного размера
        int[] rsl = new int[arrLength];
        int indElem = 0;
        //3. Начинаю копировать
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                rsl[indElem++] = data[row][col];
            }
        }
        return rsl;
    }
}
