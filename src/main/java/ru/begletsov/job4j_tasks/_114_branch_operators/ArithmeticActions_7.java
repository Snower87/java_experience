package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 7. Арифметические операции.
 * @Описание В большинстве случаев в повседневной жизни мы используем 4 арифметических действия: сложение, вычитание,
 * умножение и деление.
 * Необходимо реализовать метод, который принимает 3 параметра:
 *      1. Первый аргумент арифметического действия;
 *      2. Второй аргумент арифметического действия;
 *      3. Результат применения арифметического действия к двум первым аргументам.
 * метод должен быть реализован таким образом, чтобы он вернул строковое представление действия, которое выполнилось.
 * Например, первый аргумент 100, второй 200, а результат вычисления - 300 - значит метод должен вернуть строку "added".
 * Для разности - "subtracted", умножения - "multiplied", деления - "divided". Если никакого арифметического действия
 * над исходными значениями выполнить нельзя - метод должен вернуть строку "none".
 * @author Sergei Begletsov
 * @since 09.04.2021
 * @version 1
 */

public class ArithmeticActions_7 {
    public static String selectAction(int left, int right, int rsl) {
        if (rsl == left + right) {
            return "added";
        }
        if (rsl == left - right) {
            return "subtracted";
        }
        if (rsl == left * right) {
            return "multiplied";
        }
        if (rsl == left / right) {
            return "divided";
        }
        return "none";
    }
}
