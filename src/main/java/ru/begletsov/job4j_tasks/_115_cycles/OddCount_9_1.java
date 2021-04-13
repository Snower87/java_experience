package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 9.1. Найти количество нечетных в диапазоне
 * @Описание Даны два целых положительных числа a и b (b > a). Найти количество нечетных чисел в диапазоне [a, b].
 * Нечетным считается число, у которого остаток от деления на 2 равен 1
 * @author Sergei Begletsov
 * @since 13.04.2021
 * @version 1
 */

public class OddCount_9_1 {
    public static int count(int a, int b) {
        int nOdd = 0;
        for (int ind = a; ind <= b; ind++) {
            if (ind % 2 == 1) {
                nOdd++;
            }
        }
        return nOdd;
    }
}
