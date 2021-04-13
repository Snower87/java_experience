package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 6. Произведение чисел в диапазоне
 * @Описание Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно
 * @author Sergei Begletsov
 * @since 13.04.2021
 * @version 1
 */

public class MultiplicationLoop_6 {
    public static int mult(int a, int b) {
        int rsl = 1;
        for (int start = a; start <= b; start++) {
            rsl *= start;
        }
        return rsl;
    }
}
