package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Comparator;

/**
 * @Задание 1.1. Вызов компаратора. Метод naturalOrder()
 * @Раздел 1.3.4. Сортировка
 * @Описание Существует понятие naturalOrder(). Дословно естественный порядок. Например,
 * - естественный порядок чисел это порядок возрастания. 1 2 3
 * - естественный порядок строк это лексикографический порядок. "a", "b"
 * Существует одноименный метод Comparator.naturalOrder(), этот метод возвращает компаратор основанный на реализации
 * метода compareTo у типа, который его вызывает.
 * Если вызвать этот метод для числа, например для int, произойдет autoboxing к Integer и будет использована реализация
 * compareTo в классе. Ваша задача вызвать естественный компаратор для строки.
 * @author Sergei Begletsov
 * @since 25.05.2021
 * @version 1
 */

public class NaturalOrder_1_1 {
    public static Comparator<String> naturalOrder() {
        return Comparator.naturalOrder();
    }
}
