package ru.begletsov.basic_java.metanit._10_stream_api._8_reduce;

import ru.begletsov.basic_java.metanit._10_stream_api.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

public class _8_section {
    public static void main(String[] args) {
        //8. Метод reduce

        //Метод reduce выполняет терминальные операции сведения, возвращая некоторое значение - результат операции.
        // Он имеет следующие формы:
        //1) Optional<T> reduce(BinaryOperator<T> accumulator)
        //2) T reduce(T identity, BinaryOperator<T> accumulator)
        //3) U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)

        //8.1 Пример для Optional<T> reduce
        //Объект BinaryOperator<T> представляет функцию, которая принимает два элемента и выполняет над ними некоторую операцию,
        //возвращая результат. При этом метод reduce сохраняет результат и затем опять же применяет к этому результату
        //и следующему элементу в наборе бинарную операцию.
        System.out.println("8.1) Optional<T> reduce (сумма элементов):");
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> rsl = numbersStream.reduce((x, y) -> x + y);
        System.out.println("сумма элементов: " + rsl.get());
        System.out.println();

        System.out.println("8.1) Optional<T> reduce (объединение слов в предложение):");
        Stream<String> worldsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = worldsStream.reduce((x, y) -> x + " " + y);
        System.out.println("предложение: " + sentence.get());
        System.out.println();

        //8.2 Пример для T reduce(T identity, BinaryOperator<T> accumulator)
        //Первый параметр - T identity - элемент, который предоставляет начальное значение для функции из второго параметра,
        //а также предоставляет значение по умолчанию, если поток не имеет элементов.
        //Второй параметр - BinaryOperator<T> accumulator, как и первая форма метода reduce, представляет ассоциативную функцию,
        //которая запускается для каждого элемента в потоке и принимает два параметра.
        //Первый параметр представляяет промежуточный результат функции, а второй параметр - следующий элемент в потоке.
        System.out.println("8.2) T reduce(T identity, BinaryOperator<T> accumulator)");
        Stream<Integer> numberStream2 = Stream.of(-4, -3, -2, -1);
        Integer rsl2 = numberStream2.reduce(5, (x, y) -> x + y);
        System.out.println("сумма элементов: " + rsl2);
        System.out.println();

        //8.3 Пример использования reduce для сложного типа данных
        System.out.println("8.3) Пример использования reduce для сложного типа данных:");
        ArrayList phoneList = new ArrayList();
        phoneList.addAll(Arrays.asList(
                new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000)
        ));
        Stream<Phone> phoneStream = phoneList.stream();
        int sum = phoneStream.reduce(0, (x, y) -> {
                if (y.getPrice() > 50000) {
                    return x + y.getPrice();
                } else {
                    return x + 0;
                }
            },
                (x, y) -> x + y);
        System.out.println("общая стоимость всех телефонов, дороже 50к: " + sum);

        //или так тоже можно поток создать
        Stream.of(new Phone("iPhone 6 S", 54000),
                  new Phone("Lumia 950", 45000),
                  new Phone("Samsung Galaxy S 6", 40000),
                  new Phone("LG G 4", 32000));
    }
}
