package ru.begletsov.sorting_algorithm.javarush.slow;

import java.util.Arrays;

/**
 * Class SelectionSort сортировка выбором
 * неэффективная, сложность алгоритма O(n^2)
 * @author Sergei Begletsov
 * @since 08.12.2021
 * @version 1
 */

public class SelectionSort {
    private int step;

    public void swap(int[] array, int ind1, int ind2) {
        System.out.print("Переставляем элементы: ");
        System.out.println(array[ind1] + ", " + array[ind2] +  " с индексами " + ind1 + ", " + ind2 + " соотв.");
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    public void showArray(int[] array) {
        Arrays.stream(array).forEach(a -> System.out.print(a + " "));
        System.out.println();
    }

    public void showNumStep() {
        System.out.println("Кол-во шагов: " + step);
    }

    SelectionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            System.out.println("Индекс " + left);
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                    step++;
                }
            }
            swap(array, left, minInd);
        }
        showNumStep();
    }
}
