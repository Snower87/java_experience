package ru.begletsov.basic_java.metanit._10_stream_api._3_forEach_filter_map_flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class _3_forEach_filter_map_flatMap {
    public static void main(String[] args) {
        //3. Фильтрация, перебор элементов и отображение

        //3.1 Перебор элементов. Метод forEach
        //Фактически это будет аналогично перебору всех элементов в цикле for и выполнению с ними действия, а именно вывод на консоль.
        System.out.println("3.1 Перебор элементов. Метод forEach:");
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.forEach(s -> System.out.println(s));
        System.out.println();

        //3.2 Фильтрация. Метод filter
        //Для фильтрации элементов в потоке применяется метод filter(), который представляет промежуточную операцию.
        //Он принимает в качестве параметра некоторое условие в виде объекта Predicate<T> и возвращает новый поток из элементов, которые удовлетворяют этому условию
        System.out.println("3.2 Фильтрация. Метод filter (простые данные):");
        String[] strings = {"1", "2", "3", "5", "7", "9", "22"};
        Stream<String> citiesStream2 = Arrays.stream(strings);
        citiesStream2.map(s -> Integer.valueOf(s))
                .filter(i -> i >= 5)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("3.2 Фильтрация. Метод filter (сложные данные):");
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                                              new Phone("Lumia 950", 45000),
                                              new Phone("Samsung Galaxy S 6", 40000));

        phoneStream.filter(p -> p.getPrice() < 50000)
                .forEach(p -> System.out.println(p.getName()));
        System.out.println();

        //3.3 Отображение. Метод map
        //Отображение или маппинг позволяет задать функцию преобразования одного объекта в другой, то есть получить
        // из элемента одного типа элемент другого типа. Для отображения используется метод map, который имеет следующее определение:
        //<R> Stream<R> map(Function<? super T, ? extends R> mapper)
        //Передаваемая в метод map функция задает преобразование от объектов типа T к типу R. И в результате возвращается новый поток с преобразованными объектами.
        //Возьмем вышеопределенный класс телефонов и выполним преобразование от типа Phone к типу String:
        System.out.println("3.3 Отображение. Метод map:");
        Stream<Phone> phoneStream3 = Stream.of(new Phone("iPhone 6 S", 54000),
                                               new Phone("Lumia 950", 45000),
                                               new Phone("Samsung Galaxy S 6", 40000));

        //phoneStream3.map(p -> p.getName()) // помещаем в поток только названия телефонов
        phoneStream3.map(p -> "название: " + p.getName() + ", цена: " + p.getPrice()) // помещаем в поток только названия телефонов
                .forEach(s -> System.out.println(s));
        System.out.println();

        //3.4 Плоское отображение. Метод flatMap
        //Плоское отображение выполняется тогда, когда из одного элемента нужно получить несколько. Данную операцию выполняет метод flatMap:
        //<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
        System.out.println("3.4 Плоское отображение. Метод flatMap:");
        Stream<Phone> phoneStream4 = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream4.flatMap(p -> Stream.of(
                            String.format("название: %s цена без скидки: %d", p.getName(), p.getPrice()),
                            String.format("название: %s цена со скидкой: %d", p.getName(), (int) (0.9 * p.getPrice()))
                            )).forEach(System.out::println);
        System.out.println();
    }
}
