package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 16. Заполнить треугольную матрицу
 * @Описание Треугольная матрица, это матрица вида:
 * 1
 * 2 3
 * 4 5 6
 * Вам дано количество строк в результирующей матрице. Вам нужно заполнить ее.
 * Например, для 1
 * {{1}}
 * Для 2
 * {
 * {1}
 * {2, 3}
 * } и т.д.
 * @author Sergei Begletsov
 * @since 19.04.2021
 * @version 1
 */

public class TriangleMatrix_16 {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int elem = 1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i+1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = elem++;
            }
        }
        return triangle;
    }
}
