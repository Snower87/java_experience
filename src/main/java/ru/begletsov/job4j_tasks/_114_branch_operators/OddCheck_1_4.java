package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 1.4. Проверка числа на нечетность
 * @Описание Для проверки, что два числа НЕ равны друг другу используется оператор !=.
 * В данной задаче нужно проверить, что переданное число является НЕ четным.
 * Для проверки используйте операторы % и !=
 * @author Sergei Begletsov
 * @since 08.04.2021
 * @version 1
 */

public class OddCheck_1_4 {
    public static boolean check(int num) {
        return (num % 2) != 0;
    }
}
