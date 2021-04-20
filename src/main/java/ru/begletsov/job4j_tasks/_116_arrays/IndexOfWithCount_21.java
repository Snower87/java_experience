package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 21. indexOf с числом вхождений
 * @Описание У String есть метод indexOf(). Он ищет первое вхождение символа. Ваша задача написать метод,
 * который возвращает индекс по количеству вхождений. Если ничего не найдено нужно вернуть -1
 * Если если число вхождений указано равное 1, то метод работает как обычный indexOf()
 * Пример:
 *      Для строки "abc", с номером вхождения 1, при поиске символа 'c', должно вернуться 2
 *      Для строки "abcdec", с номером вхождения 2, при поиске символа 'c', должно вернуться 5
 *      Для строки "abc", с номером вхождения 1, при поиске символа 'z', должно вернуться -1
 * @author Sergei Begletsov
 * @since 20.04.2021
 * @version 1
 */

public class IndexOfWithCount_21 {
    public static int indexOf(char[] string, char c, int number) {
        int indexFindChar = 0;
        int indexChar = 0;
        for (char ch: string) {
            if (ch == c && indexChar > number) {
                indexFindChar =  indexChar;
            }
            indexChar++;
        }
        if (indexFindChar == 0) {
            return -1;
        }
        return indexFindChar;
    }
}
