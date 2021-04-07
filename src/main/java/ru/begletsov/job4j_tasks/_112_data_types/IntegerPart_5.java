package ru.begletsov.job4j_tasks._112_data_types;

/**
 * @Задание 5. Целая часть вещественного числа
 * @Описание Иногда бывает необходимо получить целую часть вещественного числа. Для этого нужно сделать ->
 * Пример:
 *      double floatNum = 1.5;
 *      long integerNum = (long) floatNum; // -> 1
 * @author Sergei Begletsov
 * @since 07.04.2021
 * @version 1
 */

public class IntegerPart_5 {
    public static void main(String[] args) {
        float floatNum = 2.6f;
        int integerNum = (int)floatNum;
        System.out.println(integerNum);
    }
}
