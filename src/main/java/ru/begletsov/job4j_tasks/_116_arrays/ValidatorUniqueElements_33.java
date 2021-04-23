package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 33. Проверка массива на уникальность элементов
 * @Описание Метод принимает массив целочисленных значений, а также число value, которое мы будем искать в этом массиве.
 * Метод должен посчитать количество одинаковых элементов которые совпадают с value, и если окажется что это число
 * больше или равно половине длины входного массива - массив считается невалидным и метод должен вернуть false.
 * @author Sergei Begletsov
 * @since 23.04.2021
 * @version 1
 */

public class ValidatorUniqueElements_33 {
    public static boolean checkArray(int[] data, int value) {
        int countValue = 0;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == value) {
                countValue++;
            }
        }
        return countValue >= data.length/2 ? false: true;
    }
}
