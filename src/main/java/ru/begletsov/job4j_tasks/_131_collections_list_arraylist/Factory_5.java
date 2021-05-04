package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 5. Заполнение списка фабричным методом
 * @Раздел 1.3.1. Коллекция List, ArrayList
 * @Описание До этого мы заполняли список, используя метод add(E e). Каким образом можно еще заполнить список значениями?
 * Для этого определен метод фабричный метод of().
 * - List<E> of(E ... elements) - метод возвращает список, в которые помещены список элементов elements типа E.
 * Как мы видим метод принимает переменное количество аргументов (обозначается ...). Т.е. мы можем перечислять большое
 * количество аргументов через запятую.
 * Стоит упомянуть, что метод возвращает неизменяемый список, т.е. вызвать метод add(), remove() и т.п. на такой
 * коллекции не получится, будет сгенерировано исключение UnsupportedOperationException.
 * Задание: в методе вам нужно заполнить коллекцию значениями от first до fifth с помощь фабричного метода of().
 * После этого с помощью цикла for() с индексами и метода get() вывести все элементы.
 * @author Sergei Begletsov
 * @since 04.05.2021
 * @version 1
 */

public class Factory_5 {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
