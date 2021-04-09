package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 2.2. Проверка двух условий. Логическое ИЛИ
 * @Описание Чтобы проверить, что одно или оба выражения являются истинными нужно использовать ||. Синтаксис:
 *      выражение1 || выражение2
 * В данной задаче вам нужно проверить, что переданное число отрицательно ИЛИ нечетно
 * @author Sergei Begletsov
 * @since 09.04.2021
 * @version 1
 */

public class LogicOr_2_2 {
    public static boolean check(int num) {
        return (num < 0) || (num % 2) != 0;
    }
}
