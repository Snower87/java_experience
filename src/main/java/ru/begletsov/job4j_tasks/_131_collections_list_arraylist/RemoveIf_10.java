package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import java.util.List;

/**
 * @Задание 10. Удаление элементов по условию
 * @Раздел 1.3.1. Коллекция List, ArrayList
 * @Описание Может возникнуть ситуация, когда нам надо удалить элементы, которые удовлетворяют какому-то условию.
 * Чтобы не писать цикл, в котором будет проверяться условие, в интерфейсе Collection (наследником которого является
 * интерфейс List) определен метод removeIf():
 * - default boolean removeIf​(Predicate<? super E> filter) - метод удаляет все элементы из коллекции, которые
 * удовлетворяют условию определенному в предикате filter(передается в виде лямбда выражения). Если в результате работы
 * метода список изменился - метод возвращает true.
 * Задание: необходимо реализовать метод, который вернет список строк, которые состоят из 5 и более символов.
 * @author Sergei Begletsov
 * @since 05.05.2021
 * @version 1
 */

public class RemoveIf_10 {
    public static List<String> sortList(List<String> list) {
        list.removeIf(str -> str.length() < 5);
        return list;
    }
}
