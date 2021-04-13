package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 7. Найти степень числа
 * @Описание Дано целое число a и целое число degree (> 0). Найти a в степени degree: a^degree = a·a· . . . ·a
 *          (числа a перемножаются degree раз).
 * @author Sergei Begletsov
 * @since 13.04.2021
 * @version 1
 */

public class DegreeLoop_7 {
    public static int calculate(int a, int n) {
        //Вариант №1
        //return (int)Math.pow(a, n);
        //Вариант №2
        int rsl = 1;
        for (int degr = 1; degr <= n; degr++) {
            rsl *= a;
        }
        return rsl;
    }
}
