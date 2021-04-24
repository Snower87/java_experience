package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 37. Массив без четных значений
 * @Описание Метод принимает массив целочисленных значений. Необходимо перебрать этот массив и выбрать из него только
 * нечетные числа и вернуть новый массив, в котором будут только нечетные числа. При этом длина нового массива должна
 * совпадать с количеством нечетных значений в исходном массиве.
 * @author Sergei Begletsov
 * @since 24.04.2021
 * @version 1
 */

public class ArrayWithoutEvenElements_37 {
    public static int[] changeData(int[] data) {
        int countEvenElement = 0;
        //1. Считаю кол-во нечетных чисел
        for (int ind = 0; ind < data.length; ind++) {
            if (data[ind] % 2 == 1) {
                countEvenElement++;
            }
        }
        //2. Создаю требуемый массив
        int[] rsl = new int[countEvenElement];
        int indexArray = 0;
        //3. Заполняю массив
        for (int ind = 0; ind < data.length; ind++) {
            if (data[ind] % 2 == 1) {
                rsl[indexArray++] = data[ind];
            }
        }
        return rsl;
    }
}
