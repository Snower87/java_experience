package ru.begletsov.basic_java.string;

/**
 * @Задание Преобразование числа -> в bin-формат (строка)
 * @author Sergei Begletsov
 * @since 03.09.2021
 * @version 1
 */

public class IntToBin {
    /**
     * Преобразование числа -> bin-значение (строка) без лидирующих нулей
     * @param num входное число
     * @return строка в bin-формате
     */
    public static String convert(int num) {
        return Integer.toBinaryString(num);
    }

    /**
     * Преобразование числа -> bin-значение (строка) c лидирующими нулями
     * @param num входное число
     * @return строка в bin-формате
     */
    public static String convertWithLead0(int num) {
        return String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
    }
}
