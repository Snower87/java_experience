package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 20. Вывести четные в порядке убывания индексов
 * @Описание Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве четные числа
 * в порядке убывания их индексов. Для вывода использовать System.out.println()
 * Например, для {1, 2, 3, 4} вывести 4, 2
 * @author Sergei Begletsov
 * @since 20.04.2021
 * @version 1
 */

public class EvenIndexDescendingPrint_20 {
    public static void print(int[] array) {
        for (int ind = array.length - 1; ind >= 0; ind--) {
            if (array[ind] % 2 == 0) {
                System.out.println(array[ind]);
            }
        }
    }
}
