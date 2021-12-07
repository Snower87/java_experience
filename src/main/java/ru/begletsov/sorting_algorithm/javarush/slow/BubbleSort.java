package ru.begletsov.sorting_algorithm.javarush.slow;

/**
 * Class BubbleSort сортировка данных методом пузырька
 * простая и неэффективная, сложность алгоритма O(n^2)
 * @author Sergei Begletsov
 * @since 07.12.2021
 * @version 1
 */

public class BubbleSort {
    private int i;

    /**
     * Метод меняет расположение элементов
     * @param array значение ссылки на массив
     * @param ind1 первый элемент
     * @param ind2 второй элемент
     */
    public void swap(int[] array, int ind1, int ind2) {
        System.out.print(++i + ". Переставляем элементы: ");
        System.out.println(array[ind1] + ", " + array[ind2] +  " с индексами " + ind1 + ", " + ind2 + " соотв.");
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    BubbleSort(int[] array) {
        System.out.println("Сортировка методом пузырька: сложность O(n^2)");
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }
}