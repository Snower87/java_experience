package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 1. Вывести на консоль числа от 0 до N
 * @Описание Выведите на консоль числа от 0 до N. N не входит. В этом упражнении используйте цикл for c index.
 * @author Sergei Begletsov
 * @since 13.04.2021
 * @version 1
 */

public class Print0ToN_1 {
    public static void out(int n) {
        for (int index = 0; index < n; index++) {
            System.out.println(index);
        }
    }
}
