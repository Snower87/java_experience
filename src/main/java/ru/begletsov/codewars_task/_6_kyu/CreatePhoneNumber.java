package ru.begletsov.codewars_task._6_kyu;

/**
 * @task Create Phone Number (6 kyu). Codewars Kata
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 * Example:
 *      Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 * @author Sergei Begletsov
 * @since 06.08.2021
 * @version 1
 */

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        char[] chars = new char[numbers.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (numbers[i] + 0x30);
        }
        String aasdasd = new String(chars);
        long longad = Long.valueOf(aasdasd);
        return String.valueOf(longad).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }
}
