package ru.begletsov.job4j_tasks._141_lambda;

import java.util.function.Supplier;

/**
 * @Задание 4.4. Method reference и Supplier
 * @Раздел 1.4.1. Lambda
 * @Описание Интерфейс Supplier служит для того, чтобы обернуть логику создания объекта. Он ничего не принимает, только
 * возвращает объект, который ему поручили создать. Ссылки на методы поддерживает метод new, который позволяет нам
 * создать нужный нам объект. Например,
 * - Supplier<List<String>> supplier = ArrayList::new;
 * - List<String> list = supplier.get() // вернет ArrayList
 * Ваша задача вернуть Supplier, который создает пустую строку через new
 * @author Sergei Begletsov
 * @since 27.08.2021
 * @version 1
 */

public class _4_4_MRSupplier {
    public static Supplier<String> supplier() {
        return String::new;
    }
}
