package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 4. Размер массива
 * @Описание У массива имеется поле, которое хранит количество элементов, которое находится в нем., т.е. размер массива.
 * Чтобы определить размер массива необходимо обратиться к этому полю следующим образом:
 *      имя_массива.length;
 * Вам даны 2 массива чисел. Вам необходимо определить общий размер массива при их объединении.
 * В этом задании объединять ничего не нужно, Вам необходимо только определить общий размер результирующего массива.
 * @author Sergei Begletsov
 * @since 15.04.2021
 * @version 1
 */

public class SizeConcatArray_4 {
    /*
     * Получает размер 2х массивов
     * @param a ссылка на 1ый массив
     * @param b ссылка на 2ой массив
     * @return возвращает общий размер 2х массивов
     */
    public static int combineSize(int[] a, int[] b) {
        return a.length + b.length;
    }
}
