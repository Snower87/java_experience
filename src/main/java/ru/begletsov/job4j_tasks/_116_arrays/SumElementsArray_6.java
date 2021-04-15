package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 6. Сумма элементов массива
 * @Описание Доступ к элементам массива осуществляется по индексам. Напомню, что первый элемент имеет индекс 0,
 * последний - имя_массива.length - 1.
 * Вам необходимо реализовать метод, который принимает массив целочисленных значений и возвращает сумму первого и
 * последнего элемента в этом массиве.
 * @author Sergei Begletsov
 * @since 16.04.2021
 * @version 1
 */

public class SumElementsArray_6 {
    /*
     * @param array - ссылка на массив
     * @return возвращает сумму 1го и последнего элемента массива
     */
    public static int getSum(int[] array) {
        int firstElement = array[0];
        int endElement = array[array.length - 1];
        return firstElement + endElement;
    }
}
