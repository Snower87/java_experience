package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 17. Транспонировать матрицу
 * @Описание Транспонирование матрицы, это когда строки исходной матрицы, становятся столбцами в результирующей матрице
 * int[][] input = {
 *                 {1, 2},
 *                 {3, 4}
 * };
 * int[][] expect = {
 *                 {1, 3},
 *                 {2, 4}
 * };
 * или такой вариант
 * int[][] input = {
 *                 {1, 2, 3},
 *                 {4, 5, 6}
 * };
 * int[][] expect = {
 *                 {1, 4},
 *                 {2, 5},
 *                 {3, 6}
 * };
 * @author Sergei Begletsov
 * @since 19.04.2021
 * @version 1
 */

public class TransposeMatrix_17 {
    public static int[][] convert(int[][] matrix) {
        //Формат исходного двумерного массива matrix[][]:
        //int[rows][cols], где rows - строка, cols - столбец
        int rows = matrix.length; //кол-во строк (транспонированной матрицы)
        int cols = matrix[0].length; //кол-во столбцов (транспонированной матрицы)
        int[][] result = new int[cols][rows];
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
}
