package ru.begletsov.job4j_tasks._112_data_types;

/**
 * @Задание 7. Получение корня из числа
 * @Описание Чтобы получить корень, нам нужно использовать библиотеку Math, а именно метод Math.sqrt. Синтаксис следующий:
 *      double переменная = Math.sqrt(число);
 * Пример:
 *      double result = Math.sqrt(4); // = 2
 * Ниже приведен код. Вам нужно его раскоментировать и получить корень числа из 9
 * @author Sergei Begletsov
 * @since 07.04.2021
 * @version 1
 */

public class MathSqrt_7 {
    public static void main(String[] args) {
        double result = Math.sqrt(9);
        System.out.println(result);
    }
}
