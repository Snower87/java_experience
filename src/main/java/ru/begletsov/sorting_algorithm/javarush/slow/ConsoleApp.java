package ru.begletsov.sorting_algorithm.javarush.slow;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleApp {
    public static void displayArray(int[] array) {
        System.out.println("Массив до сортировки:");
        Arrays.stream(array).forEach(a -> System.out.print(a + ", "));
        System.out.println();
    }

    public static void main(String[] args) {
        //1. Входные данные
        //int[] array10 = {5, 4, 7, 9, 3, 8, 6, 2, 1};
        int[] array10 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array100 = {37, 50, 23, 99, 0, 68, 11, 28, 33, 46, 55, 69, 73, 88, 40, 83, 9, 98, 15, 71};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки:");
        System.out.println("1. Сортировка пузырьком");
        System.out.println("2. Сортировка выбором");
        System.out.println("3. Сортировка вставками");
        int num = scanner.nextInt();
        switch (num) {
            case 1: {
                displayArray(array10);
                BubbleSort2 bubbleSort = new BubbleSort2(array10);
            } break;
            case 2: {
                displayArray(array10);
                SelectionSort selectionSort = new SelectionSort(array10);
            } break;
            case 3: {

            } break;
            default:
                break;
        }
    }
}
