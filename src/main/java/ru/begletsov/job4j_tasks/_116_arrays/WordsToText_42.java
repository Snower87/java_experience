package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 42. Объединение массива слов в одну строку
 * @Описание Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.
 *           Например: {"one", "two", "three"} => "one two three"
 * @author Sergei Begletsov
 * @since 26.04.2021
 * @version 1
 */

public class WordsToText_42 {
    public static String convert(String[] words) {
        String result = "";
        String delim = " ";
        int countDelimeter = words.length - 1;
        for (String word: words) {
            if (countDelimeter > 0) {
                result += word + delim;
                countDelimeter--;
            } else {
                result += word;
            }
        }
        return result;
    }
}
