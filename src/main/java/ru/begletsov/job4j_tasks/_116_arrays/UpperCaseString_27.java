package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 27. Привести строку к верхнему регистру
 * @Описание Дана строка, записанная в виде массив символов. Ваша задача создать новую строку, в которой будут в символы исходной в верхнем регистре. Если символ не является буквой, например цифры или -, то просто записать в результат.
 * Например, для a-123-B, получить A-123-B
 * Использовать доп. методы:
 *      Character.isLowerCase(c), где c исходный символ
 *      Character.toUpperCase(c), где c исходный символ
 * @author Sergei Begletsov
 * @since 21.04.2021
 * @version 1
 */

public class UpperCaseString_27 {
    public static char[] toUpperCase(char[] string) {
        for (int ind = 0; ind < string.length; ind++) {
            char ch = string[ind];
            if (Character.isLowerCase(ch) == true) {
                string[ind] = Character.toUpperCase(ch);
            }
        }
        return string;
    }
}
