package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 22. Максимальная длина неубывающей последовательности
 * @Описание Если последовательность элементов удовлетворяет условию Ak <= Ak+1 <= ... <= Ak+m она называется неубывающей.
 * Длина последовательности это количество элементов, которые в нее входят.  В массиве таких последовательностей
 * может быть несколько, вам нужно найти длину максимальной из них.
 * Для пример, взгляните на тесты
 * assertEquals(expected: 4, MaxLengthSeria.find(new int[] {1, 2, 0, 1, 2, 3}));
 * @author Sergei Begletsov
 * @since 20.04.2021
 * @version 1
 */

public class MaxLengthSeria_22 {
    public static int find(int[] array) {
        int lenSeria = 1;
        int minElem = array[0];
        for (int ind = 1; ind < array.length; ind++) {
            if (array[ind] >= minElem) {
                minElem = array[ind];
                lenSeria++;
            } else {
                minElem = array[ind];
                lenSeria = 1;
            }
        }
        return lenSeria;
    }
}
