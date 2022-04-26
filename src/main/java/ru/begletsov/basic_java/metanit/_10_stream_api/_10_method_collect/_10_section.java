package ru.begletsov.basic_java.metanit._10_stream_api._10_method_collect;

import ru.begletsov.basic_java.metanit._10_stream_api.Phone;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _10_section {
    public static void main(String[] args) {
        //10. Метод collect

        //10.1 Первая версия метода принимает в качестве параметра функцию преобразования к коллекции
        //<R,A> R collect(Collector<? super T,A,R> collector)
        //1) параметр Т - тип элемента в потоке
        //2) параметр А - тип промежуточных накапливаемых данных.
        //В итоге параметр collector представляет функцию преобразования потока в коллекцию.

        //10.2 Java уже предоставляет ряд встроенных функций, определенных в классе Collectors:
        //toList(): преобразование к типу List
        //toSet(): преобразование к типу Set
        //toMap(): преобразование к типу Map

        //10.3 Использование метода toList()
        System.out.println("10.3 Использование метода toList():");
        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "LG G6", "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                            "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                            "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850", "LG G6");
        List<String> listFilteredPhones = phones.stream()
                                            .filter(s -> s.length() < 10)
                                            .collect(Collectors.toList());
        listFilteredPhones.forEach(System.out::println);
        System.out.println();

        //10.4 Использование метода toSet()
        System.out.println("10.3 Использование метода toSet():");
        Set<String> setFilteredPhones = phones.stream()
                                               .filter(s -> s.length() < 10)
                                               .collect(Collectors.toSet());
        setFilteredPhones.forEach(System.out::println);
        System.out.println();

        //10.5 Использование метода toMap()
        //Для применения метода toMap() надо задать ключ и значение.
        System.out.println("10.3 Использование метода toMap():");
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 8", 54000),
                new Phone("Nokia 9", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("LG G6", 32000));
        Map<String, Integer> mapPhones = phoneStream.collect(Collectors.toMap(p -> p.getName(), t -> t.getPrice()));
        mapPhones.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();

        //10.6 Получение определенного типа коллекции (например HashSet)
        //Если нам надо создать какой-то определенный тип коллекции, например, HashSet, то мы можем использовать специальные функции, которые определены в классах-коллекций.
        System.out.println("10.6 Получение определенного типа коллекции (например HashSet):");
        HashSet<String> phoneHashSet = phones.stream()
                                             .filter(s -> s.length() > 12)
                                             .collect(Collectors.toCollection(HashSet::new));
        phoneHashSet.forEach(System.out::println);
        System.out.println();
        //Аналогичным образом можно получать другие коллекции, например, ArrayList:
        //ArrayList<String> result = phones.collect(Collectors.toCollection(ArrayList::new));

        //10.7 Вторая форма метода collect (3 параметра)
        //<R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
        //1) supplier: создает объект коллекции
        //2) accumulator: добавляет элемент в коллекцию
        //3) combiner: бинарная функция, которая объединяет два объекта
        System.out.println("10.7 Вторая форма метода collect (3 параметра):");
        Stream<String> phones7 = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850"
        );
        ArrayList<String> filteredPhonesCollectVer2 = phones7.filter(s -> s.length() < 12)
                .collect( ()->new ArrayList<String>(), // создаем ArrayList
                          (list, item)->list.add(item), // добавляем в список элемент
                          (list1, list2)-> list1.addAll(list2)); // добавляем в список другой список
        filteredPhonesCollectVer2.forEach(s -> System.out.println(s));
        System.out.println();
    }
}
