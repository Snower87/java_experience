package ru.begletsov.codewars_task._7_kyu;

/**
 * @task Descending Order (7 kyu). Codewars Kata
 * Our task is to make a function that can take any non-negative integer as an argument and return it with its digits
 * in descending order. Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 * @author Sergei Begletsov
 * @since 05.05.2021
 * @version 1
 */

public class DescendingOrder {
    /**
     * Функция делает переворот (реверс) числа
     * @param num число на входе
     * @return возвращает перевернутое число
     */
    public static int sortDesc(final int num) {
        String rsl = new  StringBuilder(Integer.toString(num)).reverse().toString();
        return Integer.valueOf(rsl);
    }
}
