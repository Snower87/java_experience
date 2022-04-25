package ru.begletsov.basic_java.metanit._10_stream_api._4_sorted;

import ru.begletsov.basic_java.metanit._10_stream_api.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class _4_sorted {
    public static void main(String[] args) {
        //4. Сортировка

        //4.1 Для простой сортировки по возрастанию применяется метод sorted()
        System.out.println("4.1 Для простой сортировки по возрастанию применяется метод sorted():");
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                                "Pixel 2");

        //Данный метод подходит только для сортировки тех объектов, которые реализуют интерфейс Comparable.
        phones.stream()
              .filter(p -> p.length() < 12)
              .sorted()
              .forEach(s -> System.out.println(s));
        System.out.println();

        //4.2 Сортировка с использованием своего компаратора
        //Если же у нас классы объектов не реализуют этот интерфейс или мы хотим создать какую-то свою логику сортировки,
        //то мы можем использовать другую версию метода sorted(), которая в качестве параметра принимает компаратор.
        System.out.println("4.2 Сортировка с использованием своего компаратора:");
        Stream<Phone> phoneStream2 = Stream.of(
                new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000)
        );
        phoneStream2.sorted(new ComparatorPhonesByPrice())
                    .forEach(s -> System.out.println(s.getPrice() + " " + s.getName()));
    }
}
