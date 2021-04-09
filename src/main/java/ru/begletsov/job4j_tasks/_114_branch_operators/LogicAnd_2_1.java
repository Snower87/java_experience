package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 2.1. Проверка двух условий. Логическое И
 * @Описание Чтобы проверить, что оба выражения являются истинными нужно использовать &&. Синтаксис
 *      выражение1 && выражение2
 * В данной задаче вам нужно проверить, что переданное число положительно И четное
 * Допишите программу приведенную ниже. Программа должна вернуть истина, если первое равно второму.
 * @author Sergei Begletsov
 * @since 09.04.2021
 * @version 1
 */

public class LogicAnd_2_1 {
    public static boolean check(int num) {
        return num > 0 &&  (num % 2) == 0;
    }
}