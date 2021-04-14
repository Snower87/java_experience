package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 9.5. Сумма цифр
 * @Описание Дано число, нужно получить сумму его цифр
 * Например,
 * 12 => 1 + 2 => 3
 * @author Sergei Begletsov
 * @since 14.04.2021
 * @version 1
 */

public class DigitSum_9_5 {
    public static int sum(int num) {
        //Вариант №1
        String nStr = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < nStr.length(); i++) {
            sum += Character.digit(nStr.charAt(i),10);
        }
        return sum;
    }
}
