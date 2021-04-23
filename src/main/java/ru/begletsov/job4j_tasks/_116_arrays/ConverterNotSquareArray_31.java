package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 31. Конвертировать неквадратный двумерный массив в квадратный
 * @Описание Метод принимает двумерный массив у которого число рядов и число элементов в ряду не совпадают, также
 * количество элементов в каждом ряду может быть абсолютно произвольным.
 * Вам необходимо реализовать метод так, чтобы на выходе получился двумерный квадратный массив. При этом размерность
 * выходного массива должна рассчитываться. Если для полного заполнения выходного массива в исходном массиве не хватает
 * элементов - необходимо дополнить массив 0.
 * Например:
 *      Исходный массив {{1}, {2, 3, 4}} - должно получиться {{1, 2}, {3, 4}}
 *      Исходный массив {{1}, {2, 3, 4}, {5, 6}} - должно получиться {{1, 2, 3}, {4, 5, 6}, {0, 0, 0}}
 * @author Sergei Begletsov
 * @since 23.04.2021
 * @version 1
 */

public class ConverterNotSquareArray_31 {
    /**
     * Получает кол-во элементов в квадратичном (несимметричном) массиве
     * @param array входной квадратичный массив
     * @return возвращает кол-во (длину) квадратичного массива
     */
    public static int getLenSquareArray(int[][] array) {
        int lenArray = 0;
        for (int row = 0; row < array.length; row++) {
            lenArray += array[row].length;
        }
        return lenArray;
    }

    /**
     * Переводит квадратичный массив -> в линейный
     * @param array входной квадратичный массив
     * @return линейный массив
     */
    public static int[] convertSquareInLinearArray(int[][] array) {
        int[] rsl = new int[getLenSquareArray(array)];
        int indRsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                rsl[indRsl++] = array[row][col];
            }
        }
        return rsl;
    }

    public static int[][] convertInSquareArray(int[][] array) {
        //1. Считаем размерность входного массива
        int lenArray = 0;
        for (int row = 0; row < array.length; row++) {
            lenArray += array[row].length;
        }
        for (int a = 1; a < lenArray; a++) {
            if (lenArray == Math.pow(a, 2)) {
                lenArray = a;
                break;
            } else {
                if (lenArray > Math.pow(a, 2) && lenArray < Math.pow(a + 1, 2)) {
                    lenArray = a + 1;
                    break;
                }
            }
        }
        //2. Создание и заполнение массива
        int[][] rsl = new int[lenArray][lenArray];
        int[] linearArray = convertSquareInLinearArray(array);
        int row = 0;
        int col = 0;
        for (int index = 0; index < linearArray.length; index++) {
            rsl[row][col] = linearArray[index];
            if (col + 1 >= lenArray) {
                col = 0;
                row++;
            } else {
                col++;
            }
        }
        return rsl;
    }
}
