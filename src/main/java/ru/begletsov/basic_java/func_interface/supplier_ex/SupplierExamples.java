package ru.begletsov.basic_java.func_interface.supplier_ex;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/**
 * @Задание 1. Примеры реализации функц. интерф. Supplier (поставщик)
 * @Раздел 1.2 Функциональный интерфейс
 * @author Sergei Begletsov
 * @since 21.08.2021
 * @version 1
 */

public class SupplierExamples {
    public static void main(String[] args) {
        //1. Примеры реализации функц. интерф. Supplier (поставщик)
        Supplier<String> supplier = () -> "Example 10. Supplier. New string for interface";
        System.out.println(supplier.get());
        System.out.println();

        System.out.println("Example 11. Supplier");
        List<Integer> list = List.of(1, 2, 3, 10, 1, 1, 2, 4, 1);
        Supplier<Set<Integer>> sup = () -> new HashSet<>(list);
        Set<Integer> integers = sup.get();
        for (Integer integer: integers) {
            System.out.println(integer);
        }
        System.out.println();
    }
}
