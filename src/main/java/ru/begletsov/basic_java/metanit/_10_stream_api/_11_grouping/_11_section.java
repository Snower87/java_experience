package ru.begletsov.basic_java.metanit._10_stream_api._11_grouping;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _11_section {
    public static void main(String[] args) {
        //11. Группировка

        //11.1 Пример группировки по названию компании. Метод Collectors.groupingBy()
        System.out.println("11.1 Пример группировки по названию компании. Метод Collectors.groupingBy():");
        Stream<Phone11> phone11Stream = Stream.of(
                new Phone11("iPhone X", "Apple", 600),
                new Phone11("Pixel 2", "Google", 500),
                new Phone11("iPhone 8", "Apple",450),
                new Phone11("Galaxy S9", "Samsung", 440),
                new Phone11("Galaxy S8", "Samsung", 340)
        );

        //Для создания групп в метод phoneStream.collect() передается вызов функции Collectors.groupingBy(),
        //которая с помощью выражения Phone::getCompany группирует объекты по компании. В итоге будет создан объект Map,
        //в котором ключами являются названия компаний, а значениями - список связанных с компаниями телефонов.
        Map<String, List<Phone11>> phonesByCompany = phone11Stream.collect(
                Collectors.groupingBy(Phone11::getCompany));

        //Вариант 1 вывода на консоль
        System.out.println("Вариант 1 вывода на консоль:");
        for (Map.Entry item: phonesByCompany.entrySet()) {
            String company = (String) item.getKey();
            System.out.println("Компания: " + company + ", и ее телефоны:");
            List<Phone11> phone11List = phonesByCompany.get(company);
            for (Phone11 phone: phone11List) {
                System.out.println(phone.getName() + " " + phone.getPrice());
            }
            System.out.println();
        }

        //Вариант 2
        System.out.println("Вариант 2:");
        for (Map.Entry<String, List<Phone11>> item: phonesByCompany.entrySet()) {
            System.out.println("company: " + item.getKey());
            for (Phone11 phone: item.getValue()) {
                System.out.println(phone.getName() + " " + phone.getPrice());
            }
            System.out.println();
        }
        System.out.println();

        //11.2 Метод Collectors.partitioningBy
        //Метод Collectors.partitioningBy() имеет похожее действие, только он делит элементы на группы по принципу,
        //соответствует ли элемент определенному условию
        System.out.println("11.2 Метод Collectors.partitioningBy:");
        List<Phone11> phone11List = List.of(
                new Phone11("iPhone X", "Apple", 600),
                new Phone11("Pixel 2", "Google", 500),
                new Phone11("iPhone 8", "Apple",450),
                new Phone11("Galaxy S9", "Samsung", 440),
                new Phone11("Galaxy S8", "Samsung", 340)
        );

        //С помощью условия p->p.getCompany() == "Apple" мы смотрим, принадлежит ли телефон компании Apple.
        //Если телефон принадлежит этой компании, то он попадает в одну группу, если нет, то в другую.
        Map<Boolean, List<Phone11>> partitioningByPhone = phone11List.stream().collect(
                Collectors.partitioningBy(p -> p.getCompany() == "Apple"));

        for (Map.Entry<Boolean, List<Phone11>> item: partitioningByPhone.entrySet()) {
            System.out.println("key = " + item.getKey());
            for (Phone11 phone11: item.getValue()) {
                System.out.println(phone11.getName() + " " + phone11.getPrice() + " " + phone11.getCompany());
            }
        }
        System.out.println();

        //11.3 Метод Coollectors.counting
        //Метод Collectors.counting применяется в Collectors.groupingBy() для вычисления количества элементов в каждой группе
        System.out.println("11.3 Метод Coollectors.counting");
        Map<String, Long> countingPhones = phone11List.stream().collect(
                Collectors.groupingBy(Phone11::getCompany, Collectors.counting()));

        for (Map.Entry<String, Long> item: countingPhones.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
        System.out.println();

        //11.4 Метод Collectors.summing
        //Метод Collectors.summing применяется для подсчета суммы. В зависимости от типа данных, к которым применяется метод,
        //он имеет следующие формы: summingInt(), summingLong(), summingDouble().
        System.out.println("11.4 Метод Collectors.summing");
        //Применим этот метод для подсчета стоимости всех смартфонов по компаниям
        Map<String, Long> summingPhones = phone11List.stream().collect(
                Collectors.groupingBy(Phone11::getCompany, Collectors.summingLong(Phone11::getPrice)));
        summingPhones.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();

        //11.5 Методы maxBy и minBy
        //Методы maxBy и minBy применяются для подсчета минимального и максимального значения в каждой группе.
        //В качестве параметра эти методы принимают функцию компаратора, которая нужна для сравнения значений.
        System.out.println("11.5 Методы maxBy и minBy");
        //Найдем для каждой компании телефон с минимальной ценой
        Map<String, Optional<Phone11>> maxMinByPhones = phone11List.stream().collect(
                Collectors.groupingBy(Phone11::getCompany,
                                      Collectors.minBy(Comparator.comparing(Phone11::getPrice))));
        //Вариант 1 вывода на консоль
        maxMinByPhones.forEach((k, opt) -> System.out.println(k + " " + opt.get().getPrice()));
        //Вариант 2
        for (Map.Entry<String, Optional<Phone11>> item: maxMinByPhones.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue().get().getName());
        }
        System.out.println();

        //11.6 Метод summarizing
        //Методы summarizingInt() / summarizingLong() / summarizingDouble() позволяют объединить в набор значения соответствующих типов
        System.out.println("11.6 Метод summarizing");
        //Метод Collectors.summarizingInt(Phone::getPrice)) создает набор, в который помещаются цены для всех телефонов каждой из групп.
        //Данный набор инкапсулируется в объекте IntSummaryStatistics
        //У этих объектов есть ряд методов, который позволяют выполнить различные атомарные операции над набором:
        // getAverage(): возвращает среднее значение
        // getCount(): возвращает количество элементов в наборе
        // getMax(): возвращает максимальное значение
        // getMin(): возвращает минимальное значение
        // getSum(): возвращает сумму элементов
        // accept(): добавляет в набор новый элемент
        Map<String, IntSummaryStatistics> summaryStatisticsPhone = phone11List.stream().collect(
                Collectors.groupingBy(Phone11::getCompany,
                                      Collectors.summarizingInt(Phone11::getPrice)));
        for (Map.Entry<String, IntSummaryStatistics> item: summaryStatisticsPhone.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue().getAverage());
        }
        System.out.println();

        //11.7 Метод mapping
        //Метод mapping позволяет дополнительно обработать данные и задать функцию отображения объектов из потока на какой-нибудь другой тип данных.
        System.out.println("11.7 Метод mapping");
        Map<String, List<String>> mappingPhones = phone11List.stream().collect(
                Collectors.groupingBy(Phone11::getCompany,
                        Collectors.mapping(Phone11::getName, Collectors.toList())));
        for (Map.Entry<String, List<String>> item: mappingPhones.entrySet()) {
            System.out.println("<<" + item.getKey() + ">> : ");
            for (String name: item.getValue()) {
                System.out.println(name);
            }
        }
        System.out.println();
    }
}

class Phone11 {
    private String name;
    private String company;
    private int price;

    public Phone11(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }
}