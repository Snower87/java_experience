package ru.begletsov.codewars_task._5_kyu;

/**
 * @task String incrementer (5 kyu). Codewars Kata
 * Your job is to write a function which increments a string, to create a new string.
 * If the string already ends with a number, the number should be incremented by 1.
 * If the string does not end with a number. the number 1 should be appended to the new string.
 * Examples:
 * foo -> foo1
 * foobar23 -> foobar24
 * foo0042 -> foo0043
 * foo9 -> foo10
 * foo099 -> foo100
 * Attention: If the number has leading zeros the amount of digits should be considered.
 * @author Sergei Begletsov
 * @since 11.01.2022
 * @version 1
 */

public class StringIncrementer {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String incrementString(String str) {
        String digit = str.replaceAll("\\D+","");
        int lenDiditString = digit.length();
        if (!isNumeric(digit)) {
            return str + "1";
        }
        String rsl = str.replaceFirst(digit, String.format("%0" + lenDiditString + "d", Integer.valueOf(digit) + 1));
        return rsl;
    }
}
