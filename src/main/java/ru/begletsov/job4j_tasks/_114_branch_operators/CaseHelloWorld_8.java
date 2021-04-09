package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 8. Hello World
 * @Описание Метод принимает число. Необходимо проверить у этого числа следующие условия и при этом вернуть следующие результаты:
 *      1. Если число делится на 3 без остатка - метод должен вернуть строку Hello;
 *      2. Если число делится на 5 без остатка - метод должен вернуть строку World;
 *      3. Если число делится на 3 и на 5 одновременно без остатка - метод должен вернуть строку Hello, World!!!
 *      4. Если не выполнится ни одно из выше указанных условий - метод должен вернуть строку Operation not support.
 * Для решения необходимо будет написать 2 булево выражения и там где это нужно объединить их правильным образом.
 * @author Sergei Begletsov
 * @since 09.04.2021
 * @version 1
 */

public class CaseHelloWorld_8 {
    public static String checkNumber(int number) {
        boolean div3 = (number % 3) == 0;
        boolean div5 = (number % 5) == 0;
        if (div3 == true && div5 == true) {
            return "Hello, World!!!";
        }
        if (div3 == true) {
            return "Hello";
        }
        if (div5 == true) {
            return "World";
        }
        return "Operation not support";
    }
}
