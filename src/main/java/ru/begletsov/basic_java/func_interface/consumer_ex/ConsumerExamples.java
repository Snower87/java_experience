package ru.begletsov.basic_java.func_interface.consumer_ex;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Задание 2. Примеры реализации функц. интерф. Consumer (потребитель)
 * @Раздел 1.2 Функциональный интерфейс
 * @author Sergei Begletsov
 * @since 21.08.2021
 * @version 1
 */

public class ConsumerExamples {
    public static void main(String[] args) {
        //2. Примеры реализации функц. интерф. Consumer (потребитель)
        Supplier<String> sup20 = () -> "Example 20. Consumer";
        Consumer<String> cons20 = (s) -> System.out.println(s);
        cons20.accept(sup20.get());
        System.out.println();

        Supplier<String> sup21 = () -> "Example 21. BiConsumer";
        BiConsumer<String, String> cons21 = (s1, s2) -> System.out.println(s1 + " " + s2);
        cons21.accept(sup21.get(), "+ Supplier");
        System.out.println();

        System.out.println("Example 22. BiConsumer + Supplier");
        List<String> list22 = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sup22 = () -> new HashSet<>(list22);
        BiConsumer<Integer, String> cons22 = (s1, s2) -> System.out.println(s1 + s2);
        Set<String> strings22 = sup22.get();
        int index = 1;
        for (String str22: strings22) {
            cons22.accept(index++, " is " + str22);
        }
        System.out.println();
    }
}
