package ru.begletsov.basic_java.metanit._10_stream_api._7_count_findFirst_findAny_allMatch_anyMatch_nonematch_min_max;

import ru.begletsov.basic_java.metanit._10_stream_api.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class _7_section {
    public static void main(String[] args) {
        //7. Операции сведения
        //Операции сведения представляют терминальные операции, которые возвращают некоторое значение - результат операции.

        //7.1 Метод count()
        //Метод count() возвращает количество элементов в потоке данных
        System.out.println("7.1 Метод count():");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(new String[] {"Tom", "Sam", "Bob", "Alice"}));
        System.out.println("кол-во элементов в names: " + names.stream().count()); //4
        System.out.println();

        //7.2 Методы findFirst() и findAny()
        //Метод findFirst() извлекает из потока первый элемент, а findAny() извлекает случайный объект из потока (нередко так же первый)
        System.out.println("7.2 Методы findFirst() и findAny():");
        Optional<String> first = names.stream().findFirst();
        Optional<String> any = names.stream().findAny();
        System.out.println("first элемент: " + first.get());
        System.out.println("any элемент: " + any.get());
        System.out.println();

        //7.3 Методы allMatch(), anyMatch(), noneMatch()
        //Методы возвращают логические значение true или false:
        //- boolean allMatch(Predicate<? super T> predicate):
        //      возвращает true, если все элементы потока удовлетворяют условию в предикате
        //- boolean anyMatch(Predicate<? super T> predicate):
        //      возвращает true, если хоть один элемент потока удовлетворяют условию в предикате
        //- boolean noneMatch(Predicate<? super T> predicate):
        //      возвращает true, если ни один из элементов в потоке не удовлетворяет условию в предикате
        System.out.println("7.3 Методы allMatch(), anyMatch(), noneMatch():");

        // есть ли в потоке строка, длина которой больше 3
        boolean anyMatch = names.stream().anyMatch(s -> s.length() > 3);
        System.out.println("anyMatch: " + anyMatch);

        // все ли строки имеют длину в 3 символа
        boolean allMatch = names.stream().allMatch(s -> s.length() == 3);
        System.out.println("allMatch: " + allMatch);

        // НЕТ ЛИ в потоке строки "Bill". Если нет, то true, если есть, то false
        boolean noneMatch = names.stream().noneMatch(s -> s == "Bill");
        System.out.println("noneMatch: " + noneMatch);
        System.out.println();

        //7.4 Методы min() и max()
        //Методы min() и max() возвращают соответственно минимальное и максимальное значение.
        //Поскольку данные в потоке могут представлять различные типы, в том числе сложные классы, то в качестве параметра в эти методы передается объект интерфейса Comparator, который указывает, как сравнивать объекты:
        //- Optional<T> min(Comparator<? super T> comparator)
        //- Optional<T> max(Comparator<? super T> comparator)
        System.out.println("7.4 Методы min() и max():");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 9, 10}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("min: " + min.get());
        System.out.println("max: " + max.get());
        System.out.println();

        //Интерфейс Comparator - это функциональный интерфейс, который определяет один метод compare, принимающий
        //два сравниваемых объекта и возвращающий число (если первый объект больше, возвращается положительное число,
        //иначе возвращается отрицательное число). Поэтому вместо конкретной реализации компаратора мы можем передать
        //лямбда-выражение или метод, который соответствует методу compare интерфейса Comparator. Поскольку сравниваются
        //числа, то в метод передается в качестве компаратора статический метод Integer.compare().
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("iPhone 8", 52000),
                new Phone("Nokia 9", 35000),
                new Phone("Samsung Galaxy S9", 48000),
                new Phone("HTC U12", 36000)
        ));

        Phone phoneWithMinPrice = phones.stream().min(new PhoneComparatorByPrice()).get();
        Optional<Phone> phoneWithMaxPrice = phones.stream().max(Comparator.comparingInt(Phone::getPrice).reversed());
        System.out.println("phoneWithMinPrice: " + phoneWithMinPrice.getPrice());
        System.out.println("phoneWithMaxPrice: " + phoneWithMaxPrice.get().getName() + " " + phoneWithMaxPrice.get().getPrice());
    }


}
