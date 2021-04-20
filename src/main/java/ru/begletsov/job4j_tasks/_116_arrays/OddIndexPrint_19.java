package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 19. Вывести нечетные в порядке возрастания индексов
 * @Описание Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве нечетные числа
 * в порядке возрастания их индексов. Для вывода использовать System.out.println()
 * @author Sergei Begletsov
 * @since 20.04.2021
 * @version 1
 */

public class OddIndexPrint_19 {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
