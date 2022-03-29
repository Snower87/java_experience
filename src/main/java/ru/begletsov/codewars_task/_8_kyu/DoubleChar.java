package ru.begletsov.codewars_task._8_kyu;

/**
 * @task Double Char (8 kyu). Codewars Kata
 * Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
 * Examples (Input -> Output):
 * "String"      -> "SSttrriinngg"
 * "Hello World" -> "HHeelllloo  WWoorrlldd"
 * "1234!_ "     -> "11223344!!__  "
 * @author Sergei Begletsov
 * @since 29.03.2022
 * @version 1
 */

public class DoubleChar {
    public static String doubleChar(String s) {
        StringBuffer rsl = new StringBuffer();
        for (char ch: s.toCharArray()) {
            rsl.append(String.valueOf(ch).repeat(2));
        }
        return rsl.toString();
    }
}
