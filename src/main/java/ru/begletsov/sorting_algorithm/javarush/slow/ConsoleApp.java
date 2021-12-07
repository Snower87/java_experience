package ru.begletsov.sorting_algorithm.javarush.slow;

import java.util.Arrays;

public class ConsoleApp {
    public static void displayArray(int[] array) {
        System.out.println("Массив до сортировки:");
        Arrays.stream(array).forEach(a -> System.out.print(a + ", "));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array10 = {5, 4, 7, 1, 9, 3, 8, 6, 2};
        int[] array100 = {37, 50, 23, 99, 0, 68, 11, 28, 33, 46, 55, 69, 73, 88, 40, 83, 9, 98, 15, 71};
        displayArray(array10);
        BubbleSort bubbleSort = new BubbleSort(array10);
    }
}
