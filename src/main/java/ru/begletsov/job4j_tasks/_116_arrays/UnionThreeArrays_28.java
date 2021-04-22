package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 28. Объединить 3 массива
 * @Описание Метод принимает 3 массива целочисленных значений, при этом каждый обладает следующими свойствами:
 * 1. Имеет произвольную длину массива.
 * 2. Массив всегда имеет нечетное число элементов.
 * 3. Массив имеет количество элементов на 1 больше, чем массив из пункта 2.
 * Необходимо реализовать метод, который объединит три массива в один. При этом должны выполниться следующие условия:
 * 1. Из первого массива в результирующий массив должны попасть только первый и последний элемент, причем в результирующем массиве они должны находиться на первом и последнем месте, соответственно.
 * 2. Элементы с нечетными индексами из второго массива должны находиться в результирующем массиве на местах с четными индексами.
 * 3. Элементы с четными индексами из третьего массива, должны находиться в результирующем массиве на местах с нечетными индексами.
 * @author Sergei Begletsov
 * @since 22.04.2021
 * @version 1
 */

public class UnionThreeArrays_28 {
    public static int[] union(int[] left, int[] middle, int[] right) {
        //1. Считаем кол-во элементов
        int numElemLeftArray = 2; //кол-во элементов 1го массива
        int numElemMiddleArray = 0;
        for (int i = 0; i < middle.length; i++) {
            if (i % 2 == 1) {
                numElemMiddleArray++;
            }
        }
        int numElemRightArray = 0;
        for (int i = 0; i < right.length; i++) {
            if (i % 2 == 0) {
                numElemRightArray++;
            }
        }
        //2. Создаем результирующий массив
        int rslLength = numElemLeftArray + numElemMiddleArray + numElemRightArray;
        int[] rsl = new int[rslLength];
        //3. Заполняем массив rsl:
        //3.1 Элементами массива left
        rsl[0] = left[0];
        rsl[rslLength - 1] = left[left.length - 1];
        //3.2 Элементами массива middle
        for (int i = 0; i < rslLength - 1; i++) {
            if (i > 0 && i % 2 == 0) {
                rsl[i] = middle[i - 1];
            }
        }
        //3.3 Элементами массива right
        for (int i = 0; i < rslLength; i++) {
            if (i % 2 == 1) {
                rsl[i] = right[i - 1];
            }
        }
        return rsl;
    }
}
