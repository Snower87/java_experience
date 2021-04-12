package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 12. Необычные пары
 * @Описание Метод принимает две строки, на выходе метод должен вернуть булево значение.
 * Метод необходимо реализовать таким образом, чтобы:
 * 1. Если обе строки пустые - метод должен вернуть true.
 * 2. Если первая буква первой строки равна последней букве второй строки И
 *    последняя буква первой строки равна первой букве второй строки - метод должен вернуть true.
 * 3. Во всех остальных случаях метод должен вернуть false.
 * Для извлечения символов из строки используйте метод charAt() класса String.
 * @author Sergei Begletsov
 * @since 12.04.2021
 * @version 1
 */

public class PairsCharString_12 {
    public static boolean check(String left, String right) {
        if (left.length() == 0 || right.length() == 0) {
            return true;
        }
        if (left.charAt(0) == right.charAt(right.length() - 1) &&
                left.charAt(left.length() - 1) == right.charAt(0)) {
            return true;
        }
        return false;
    }
}
