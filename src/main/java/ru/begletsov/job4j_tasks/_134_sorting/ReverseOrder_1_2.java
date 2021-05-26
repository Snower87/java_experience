package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Comparator;

/**
 * @Задание 1.2. Вызов компаратора. Метод reverseOrder()
 * @Раздел 1.3.4. Сортировка
 * @Описание Если нам нужно получить порядок элементов обратный naturalOrder() можно использовать метод
 * Comparator.reverseOrder(). Этот метод также использует реализацию метода compareTo(). Например,
 * Если реализация такая o1.compareTo(o2), то этот метод вернет компаратор основанный на сравнении o2.compareTo(o1);
 * Ваша задача вызвать обратный компаратор для строки
 * @author Sergei Begletsov
 * @since 26.05.2021
 * @version 1
 */

public class ReverseOrder_1_2 {
    public static Comparator<String> reverseOrder() {
        return Comparator.reverseOrder();
    }
}
