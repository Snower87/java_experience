package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 8. Вывести делители числа
 * @Описание Дано целое число n (> 0). Нужно вывести делители числа.
 * Делитель это число на которое делится заданное число
 *    Например,
 * Для 1, это 1
 * Для 2, это 1 и 2
 * Для 6, это 1, 2, 3, 6
 * Для 7, это 1, 7
 * @author Sergei Begletsov
 * @since 13.04.2021
 * @version 1
 */

public class MultipliersNumber_8 {
    public static void out(int n) {
        for (int ind = 1; ind <= n; ind++) {
            if (n % ind == 0) {
                System.out.println(ind);
            }
        }
    }
}
