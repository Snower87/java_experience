package ru.begletsov.basic_java.func_interface.unaryoperator_examples;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @Задание 5. Примеры реализации функц. интерф. UnaryOperator (вх. и вых. пар-ры д. совпадать)
 * @Раздел 1.2 Функциональный интерфейс
 * @author Sergei Begletsov
 * @since 21.08.2021
 * @version 1
 */

public class UnaryOperatorExamples {
    public static void main(String[] args) {
        //5. Примеры реализации функц. интерф. UnaryOperator (разновидность Function)
        UnaryOperator<StringBuilder> unarOper50 = (s) -> s.reverse();
        System.out.println("Example 50. " + unarOper50.apply(new StringBuilder("String Test1")));
        System.out.println("Example 50. " + unarOper50.apply(new StringBuilder("tset rof gnirtS")));
        System.out.println();

        BinaryOperator<StringBuilder> binOper51 = (s1, s2) -> s1.append(" ").append(s2);
        System.out.println("Example 51. " + binOper51.apply(
                new StringBuilder("first str"),
                new StringBuilder(", second str = 222")
        ));
    }
}
