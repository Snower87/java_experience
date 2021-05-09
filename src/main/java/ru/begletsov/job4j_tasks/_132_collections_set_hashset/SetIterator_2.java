package ru.begletsov.job4j_tasks._132_collections_set_hashset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Задание 2. Итератор для Set
 * @Раздел 1.3.2. Коллекция Set, HashSet
 * @Описание Важной особенностью интерфейса Set является то, что в нем не определен метод, который позволяет
 * напрямую получить значение из множества (по аналогии с List, у Set нет метода get()). Что же делать?
 * Ведь нам же как-то надо получать значения. Для этого можно использовать Iterator, который работает по тому же принципу
 * как у List (поскольку оба интерфейса наследуются от Collection).
 * - Iterator<E> iterator() - метод возвращает объект Iterator, который позволяет обойти весь набор значений.
 * В интерфейсе Iterator определены важные методы:
 * - boolean hasNext() - метод проверяет существует ли следующий элемент в наборе.
 * - E next() - метод перемещает курсор на следующий элемент в наборе и при этом возвращает его.
 * Задание: вам необходимо раскомментировать код, заполнить коллекцию строками от one до five. Потом заполнить
 * пропуски (обозначены ...) так, чтобы в цикле печатались строки пока они есть, при этом на каждой итерации
 * выводилось сообщение, что значение существует в наборе.
 * @author Sergei Begletsov
 * @since 09.05.2021
 * @version 1
 */

public class SetIterator_2 {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one","two","three","four","five"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("Next element exist? - %s.", iterator.hasNext()));
            System.out.println(iterator.next());
        }
    }
}
