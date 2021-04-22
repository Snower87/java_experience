package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 30. Превратить одномерный массив в двумерный
 * @Описание Метод принимает массив целочисленных значений. Необходимо реализовать метод, который превратит
 * одномерный массив в квадратный двумерный. Напомню, что квадратный двумерный массив - это массив, в котором число
 * рядов и элементов в каждом ряду одинаково. При этом если элементов в исходном массиве не хватает, чтобы заполнить
 * весь двумерный массив - необходимо заполнить его 0.
 * @author Sergei Begletsov
 * @since 22.04.2021
 * @version 1
 */

public class ArrayInSquareArray_30 {
    public static int[][] convertArray(int[] array) {
        //1. Определяем размерность квадратного двумерного массива
        int len = 1;
        for (int a = 1; a < array.length; a++) {
            if (array.length == Math.pow(a, 2)) {
                len = a;
                break;
            } else {
                if (array.length > Math.pow(a, 2) && array.length < Math.pow(a + 1, 2)) {
                    len = a + 1;
                    break;
                }
            }
        }
        //2. Создание и заполнение 2d массива
        int[][] rsl = new int[len][len];
        int indArray = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < array.length; i++) {
            rsl[row][col] = array[indArray++];
            if (col + 1 >= len) {
                col = 0;
                row++;
            } else {
                col++;
            }
        }
        return rsl;
    }
}
