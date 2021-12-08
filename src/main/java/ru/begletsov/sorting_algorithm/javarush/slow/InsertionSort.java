package ru.begletsov.sorting_algorithm.javarush.slow;

/**
 * Class InsertionSort сортировка вставками
 * Сложность алгоритма O(n^2)
 * Данная сортировка является "устойчивой". Это значит, что одинаковые элементы не изменят свой порядок
 * @author Sergei Begletsov
 * @since 08.12.2021
 * @version 1
 */

public class InsertionSort {
    public void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    InsertionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            while (i-- >= 0) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
}
