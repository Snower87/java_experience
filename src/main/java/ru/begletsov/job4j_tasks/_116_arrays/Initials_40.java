package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 40. Получите инициалы (ФИО) из входной строки
 * @Описание Дан массив из трех элементов. В нем записаны соответственно Фамилия Имя Отчество.
 * Ваша задача получить инициалы.
 * Например: "Иванов", "Роман", "Иваныч" -> "Иванов Р.И."
 * @author Sergei Begletsov
 * @since 25.04.2021
 * @version 1
 */

public class Initials_40 {
    public static String convert(String[] fio) {
        String rsl = "";
        String delimSpace = " ";
        String delimDot = ".";
        for (int i = 0; i < fio.length; i++) {
            switch (i) {
                case 0: {
                    rsl += fio[i] + delimSpace;
                } break;
                case 1: {
                    rsl += fio[i].charAt(0) + delimDot;
                } break;
                case 2: {
                    rsl += fio[i].charAt(0) + delimDot;
                } break;
            }
        }
        return rsl;
    }
}
