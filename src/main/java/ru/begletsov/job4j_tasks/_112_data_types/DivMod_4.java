package ru.begletsov.job4j_tasks._112_data_types;

/**
 * @Задание 4. Целочисленное деление
 * @Описание Вам нужно раскоментировать строки и поделить число 11 нацело на 3 и получить остаток от деления от 3.
 * В Java для этого случае два оператора:
 *      1. / - который находит целую часть от деления
 *      2. % - который находит остаток от деления
 * @author Sergei Begletsov
 * @since 07.04.2021
 * @version 1
 */

public class DivMod_4 {
    public static void main(String[] args) {
        int num = 11;
        int div = num / 3;
        int mod = num % 3;
        System.out.println(div);
        System.out.println(mod);
    }
}
