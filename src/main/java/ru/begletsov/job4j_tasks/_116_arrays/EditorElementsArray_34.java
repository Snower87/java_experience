package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 34. Изменить элементы двумерного массива
 * @Описание Метод принимает двумерный массив произвольного размера, в котором может быть сколько угодно рядов,
 * а также произвольное число элементов в ряду. Необходимо перебрать массив и сравнить каждый элемент со значением el
 * которое мы передаем в параметрах метода. При этом:
 * 1. Если элемент массива больше значения el - элемент массива нужно заменить на разность между текущим значением
 *    элемента массива и значения el.
 * 2. Если элемент массива меньше или равен el - необходимо заменить текущий элемент массива 0.
 * @author Sergei Begletsov
 * @since 23.04.2021
 * @version 1
 */

public class EditorElementsArray_34 {
    public static int[][] changeData(int[][] array, int el) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > el) {
                    array[row][col] -= el;
                } else {
                    array[row][col] = 0;
                }
            }
        }
        return array;
    }
}
