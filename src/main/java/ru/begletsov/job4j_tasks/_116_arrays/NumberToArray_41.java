package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 41. Преобразовать число -> в массив цифр с обратным порядком
 * @Описание Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * Например: 12345 => {5, 4, 3, 2, 1}
 * @author Sergei Begletsov
 * @since 25.04.2021
 * @version 1
 */

public class NumberToArray_41 {
    public static int[] resolve(int number) {
        String str = Integer.toString(number);
        int[] rsl = new int[str.length()];
        for (int ind = 0; ind < rsl.length; ind++) {
            //Вариант №1
            //rsl[ind] = str.charAt(str.length() - 1 - ind) - '0';
            //Вариант №2
            //rsl[ind] = Character.getNumericValue(str.charAt(str.length() - 1 - ind));
            //Вариант №3
            char ch = str.charAt(str.length() - 1 - ind);
            if (Character.isDigit(ch)) { // Determines if the specified character is a digit.
                rsl[ind] = Character.getNumericValue(ch); //Returns the int value that the
            }
        }
        return rsl;
    }
}
