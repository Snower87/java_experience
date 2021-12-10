package ru.begletsov.sorting_algorithm.javarush.slow;

/**
 * Class ShellSort сортировка Шелла
 * @author Sergei Begletsov
 * @since 10.12.2021
 * @version 1
 */

public class ShellSort {
    public void swap(int[] array, int ind1, int ind2) {
        System.out.print("Переставляем элементы: ");
        System.out.println(array[ind1] + ", " + array[ind2] +  " с индексами " + ind1 + ", " + ind2 + " соотв.");
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    ShellSort(int[] array) {
        // Высчитываем промежуток между проверяемыми элементами
        int gap = array.length / 2;
        // Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
    }
}
