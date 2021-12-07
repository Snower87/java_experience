package ru.begletsov.sorting_algorithm.javarush.slow;

import java.util.Arrays;

public class BubbleSort2 {
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

    public BubbleSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    step++;
                    swap(array, j, j + 1);
                    showArray(array);
                }
            }
        }
        showNumStep();
    }
}
