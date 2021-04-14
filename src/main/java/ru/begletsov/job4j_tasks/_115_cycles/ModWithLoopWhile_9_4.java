package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 9.4. mod через while
 * @Описание Есть операция остаток от деления %. Вам даны два целых положительных числа числа n и d (d > 0).
 *  n это делимое, d это делитель. Вам нужно не используя операцию %, найти остаток от деления.
 * @author Sergei Begletsov
 * @since 14.04.2021
 * @version 1
 */

public class ModWithLoopWhile_9_4 {
    public static int mod(int num, int d) {
        while (num - d >= 0) {
            num -= d;
        }
        return num;
    }
}
