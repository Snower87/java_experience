package ru.begletsov.codewars_task._6_kyu;

/**
 * @Задание "Sum of Digits / Digital Root (6 kyu)". Codewars Kata
 * Digital root is the recursive sum of all the digits in a number.
 *
 * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way
 * until a single-digit number is produced. The input will be a non-negative integer.
 *
 * Examples:
 *     16  -->  1 + 6 = 7
 *    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 * @author Sergei Begletsov
 * @since 06.05.2021
 * @version 1
 */

public class DRoot {
    public static int digital_root(int n) {
        if (n < 10) {
            return n;
        } else {
            String str = Integer.toString(n); // int -> to String
            char[] chars = str.toCharArray(); // String -> to char[] array

            int sumDigit = 0;                 //'2' + '3' = 5
            for (int i = 0; i < str.length(); i++) {
                sumDigit += Character.getNumericValue(chars[i]);
            }
            sumDigit = digital_root(Integer.valueOf(sumDigit));
            return sumDigit;
        }
    }
}