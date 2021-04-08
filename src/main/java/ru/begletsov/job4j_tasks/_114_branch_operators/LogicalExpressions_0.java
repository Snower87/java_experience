package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 0. Логические выражения
 * @Описание Выражения можно записывать в операторах условия, а также присваивать переменным. Синтаксис:
 *      boolean переменная = логическое_выражение;
 * Пример:
 *      boolean isPositive = 10 > 0; //  = true
 *      boolean isPositive = -10 > 0 //  = false
 *  Ниже приведен код. Расскоментируйте его и запишите два логических условия. Сначала что число отрицательное, а потом что положительное
 * @author Sergei Begletsov
 * @since 08.04.2021
 * @version 1
 */

public class LogicalExpressions_0 {
    public static void main(String[] args) {
        int num = -1;
        boolean result1 = num < 0;
        boolean result2 = num > 0;
        System.out.println(result1);
        System.out.println(result2);
    }
}
