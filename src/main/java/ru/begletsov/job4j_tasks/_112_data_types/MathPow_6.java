package ru.begletsov.job4j_tasks._112_data_types;

/**
 * @Задание 6. Возведения числа в степень
 * @Описание В Java нет готовых операторов для возведения числа в степень, но есть библиотека Math. С помощью нее мы можем возвести число в степень. Синтаксис следующий:
 *  double имя_переменной = Math.pow(число, степень);
 *  Пример:
 *      double d = Math.pow(2, 2);
 * Ниже приведен код, раскомментируйте его и возведите число 3 в квадрат, т.е. в степень 2
 * @author Sergei Begletsov
 * @since 07.04.2021
 * @version 1
 */

public class MathPow_6 {
    public static void main(String[] args) {
        double result = Math.pow(3,2);
        System.out.println(result);
    }
}
