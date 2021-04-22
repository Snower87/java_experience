package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 29. Двумерные массивы в одномерный массив
 * @Описание Метод принимает 2 двумерных квадратных массива. Вам необходимо реализовать метод который осуществит
 * конвертацию двумерного массива в одномерный, при этом необходимо выполнить условия: при переборе двумерных массивов
 * осуществить сравнение элементов, которые стоят на местах с одинаковыми индексами, и вернуть максимальное
 * из сравниваемых значений. Максимальное из двух значений необходимо вставить в результирующий массив.
 * @author Sergei Begletsov
 * @since 22.04.2021
 * @version 1
 */

public class TwoSquareArrays_29 {
    public static int[] collectArray(int[][] left, int[][] right) {
        //1. Вычисляем длину одномерного массива
        int numElementsArray = left.length * left[0].length;
        //2. Создаем массив
        int[] rslArray = new int[numElementsArray];
        int indArray = 0;
        //3. Заполняем его
        for (int row = 0; row < left.length; row++) {
            for (int col = 0; col < left[0].length; col++) {
                if (left[row][col] > right[row][col]) {
                    rslArray[indArray++] = left[row][col];
                } else {
                    rslArray[indArray++] = right[row][col];
                }
            }
        }
        return rslArray;
    }
}