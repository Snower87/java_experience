package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 10. Создание квадратного двумерного массива
 * @Описание Научимся создавать и заполнять массив. Мы уже знаем что необходимо при создании указать количество рядов
 * и количество элементов в каждом ряду. Однако это является не обязательным, если сразу при объявлении заполнить массив.
 * Например создадим массив целочисленных значений размером 3 на 3:
 *      int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
 * соответственно количество массивов, которые разделены запятой,- это общий размер массива, количество элементов в каждом массиве - размер внутреннего массива.
 * Квадратным массивом называется двумерный массив, в котором количество элементов в ряду и строке равны между собой.
 * В задании необходимо расскомментировать код, создать массив размером 2 на 2, заполнить его значениями от 1 до 4.
 * При этом не нужно указывать размерность, она будет определена при заполнении массива.
 * @author Sergei Begletsov
 * @since 16.04.2021
 * @version 1
 */

public class CreateSquareArray_10 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
