package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 1.3. Проверка числа на четность
 * @Описание Для проверки, что два числа равны друг другу используется оператор ==. В данной задаче нужно проверить, что переданное число является четным.
 * Для проверки используйте операторы % и ==
 * @author Sergei Begletsov
 * @since 08.04.2021
 * @version 1
 */

public class EvenCheck_1_3 {
    public static boolean check(int num) {
        return (num % 2) == 0;
    }
}
