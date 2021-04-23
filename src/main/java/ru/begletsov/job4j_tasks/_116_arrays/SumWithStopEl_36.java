package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 36. Сумма элементов, пока не выполнится условие
 * @Описание Необходимо реализовать метод который принимает 2 параметра:
 *      1. Массив целочисленный значений data.
 *      2. Целое число el, которое мы будем искать в массиве data.
 * При этом должны выполниться следующие условия:
 *      1. Метод должен вернуть сумму элементов массива data, которые находятся до элемента el
 *      2. Если окажется что сумма элементов - четное число - необходимо вернуть это число, иначе - 0.
 * @author Sergei Begletsov
 * @since 23.04.2021
 * @version 1
 */

public class SumWithStopEl_36 {
    public static int count(int[] data, int el) {
        int sumElem = 0;
        for (int ind = 0; ind < data.length; ind++) {
            if (data[ind] != el) {
                sumElem += data[ind];
            } else {
                break;
            }
        }
        if (sumElem % 2 == 0) {
            return sumElem;
        }
            return 0;
    }
}
