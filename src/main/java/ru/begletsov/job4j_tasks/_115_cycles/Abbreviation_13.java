package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 13. Аббревиатуры
 * @Описание Аббревиатуры стали неотъемлемой частью нашей жизни. Мы очень часто используем и много какие выражения
 * сокращаем, забирая от каждого слова только первую букву - именно так формируются аббревиатуры.
 * Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с прописной буквы.
 * Необходимо из полученной строки сформировать аббревиатуру.
 * Для формирования новой строки используйте StringBuilder и его метод append().
 * @author Sergei Begletsov
 * @since 14.04.2021
 * @version 1
 */

public class Abbreviation_13 {
    public static String collect(String s) {
        //Вариант №1
        String[] word = s.split(" ");
        StringBuilder rsl = new StringBuilder();
        for (String w: word) {
            char ch = w.charAt(0);
            rsl.append(ch);
        }
        return rsl.toString();
    }
}
