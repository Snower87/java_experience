package ru.begletsov.job4j_tasks._112_data_types;

/**
 * @Задание 3. Приведение типов. Целые числа
 * @Описание Правила приведения типов:
 *           1) если переменная куда мы хотим поместить больше значения той переменной которую мы хотим поместить, т.е. может включать больше чисел, то мы можем просто поместить значение  ->> восходящее приведения
 *           2) в противном случае нам нужно делать явное приведение типов. Но при этом мы можем потерять часть данных. <<- нисходящее приведение
 * @author Sergei Begletsov
 * @since 07.04.2021
 * @version 1
 */

public class IntegerTypeConversion_3 {
    public static void main(String[] args) {
        int num = 1; //32bit
        long numUpper = num; //64bit
        short numLower = (short) num; //16bit
        System.out.println(numUpper);
        System.out.println(numLower);
    }
}
