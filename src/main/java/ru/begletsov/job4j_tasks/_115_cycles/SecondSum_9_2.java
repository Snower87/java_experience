package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 9.2. Найти сумму каждого второго числа в диапазоне
 * @Описание Даны два целых положительных числа a и b (b > a). Надо сложить каждое второе число в диапазоне [a, b] начиная с первого
 * Например,
 * [1, 2] => 1
 * [1, 3] => 1 + 3 = 4
 * [1, 5] => 1 + 3 + 5 = 9
 * [0, 5] => 0 + 2 + 4 = 6
 * @author Sergei Begletsov
 * @since 13.04.2021
 * @version 1
 */

public class SecondSum_9_2 {
    public static int sum(int a, int b) {
        int sum = 0;
        int indNum = 0;
        for (int ind = a; ind <= b; ind++) {
            if (indNum % 2 == 0) {
                sum += ind;
            }
            indNum++;
        }
        return sum;
    }
}
