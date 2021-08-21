package ru.begletsov.basic_java.func_interface.function_examples;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Задание 4. Примеры реализации функц. интерф. Function (переход от T -> R)
 * @Раздел 1.2 Функциональный интерфейс
 * @author Sergei Begletsov
 * @since 21.08.2021
 * @version 1
 */

public class FunctionExamples {
    public static void main(String[] args) {
        //4. Примеры реализации функц. интерф. Function (преобразования объекта T -> R)
        Function<String, Character> func40 = s -> s.charAt(2);
        System.out.println("Example 40. Function, Третий символ в строке: " + func40.apply("first"));
        System.out.println("Example 40. Function, Третий символ в строке: " + func40.apply("second"));
        System.out.println();

        BiFunction<String, Integer, String> biFunc41 = (s, i) -> s.concat(" ").concat(i.toString());
        System.out.println("Example 41. Результат работы бифункции: " + biFunc41.apply("Name", 123));
        System.out.println("Example 41. Результат работы бифункции: " + biFunc41.apply("String number", 123456));
        System.out.println();
    }
}
