package ru.begletsov.job4j_tasks._116_arrays;

import java.util.Arrays;

/**
 * @Задание 5. Индексы в массивах
 * @Описание Доступ к элементам в массивах осуществляется при помощи индексов, которые являются целочисленными значениями.
 * При этом индексация начинается с 0 и заканчивается значением имя_массива.length - 1.
 * В задании необходимо расскомментировать, расставить значения индексов так, чтобы первый метод возвращал первый элемент массива,
 * а второй метод - последний элемент массива.
 * @author Sergei Begletsov
 * @since 15.04.2021
 * @version 2
 */

public class IndexInArrays_5 {
    /*
     * Получает 1ый элемент массива
     * @param array - ссылка на массив
     * @return возвращает 1ый элемент массива
     */
    public static int getFirstElement(int[] array) {
        //Вариант 1
        //int rsl = array[0];
        //return rsl;
        //Вариант 2 (через stream)
        return Arrays.stream(array)
                .findFirst().getAsInt();
    }
    /*
     * Получает последний элемент массива
     * @param array - ссылка на массив
     * @return возвращает последний элемент массива
     */
    public static int getLastElement(int[] array) {
        //Вариант 1
        //int rsl = array[array.length - 1];
        //return rsl;
        //Вариант 2 (через stream)
        return Arrays.stream(array)
                .reduce((e1, e2) -> e2)
                .getAsInt();
    }
}
