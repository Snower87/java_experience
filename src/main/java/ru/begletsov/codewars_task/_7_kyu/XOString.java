package ru.begletsov.codewars_task._7_kyu;

/**
 * @task Exes and Ohs (7 kyu). Codewars Kata
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
 * The string can contain any char.
 *
 * Examples input/output:
 *
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 * @author Sergei Begletsov
 * @since 11.05.2021
 * @version 1
 */

public class XOString {
    /**
     * Осуществляет поиск символа и возвращает кол-во найденных совпадений
     * @param string входная строка
     * @param ch символ который надо искать
     * @return кол-во найденных совпадений
     */
    public static int getNumCharAtString(String string, char ch) {
        char[] chars = string.toLowerCase().toCharArray();
        int numCh = 0;
        for (char c: chars) {
            if (c == ch) {
                numCh++;
            }
        }
        return numCh;
    }

    /**
     * Проверяет равно ли кол-во символов 'x' и 'o'
     * @param str входная строка поиска
     * @return true - кол-во символов одинаковое (равно), false - кол-во разное (не равно)
     */
    public static boolean getXO (String str) {
        int numX = getNumCharAtString(str, 'x');
        int numO = getNumCharAtString(str, 'o');
        return numX == numO ? true : false;
    }
}
