package ru.begletsov.basic_java.metanit._10_stream_api._9_type_optional;

import java.util.*;
import java.util.stream.Stream;

public class _9_section {
    public static void main(String[] args) {
        //9. Тип Optional

        //Объект Optional<T>обертывает результат операции. После выполнения операции с помощью метода get()
        //объекта Optional мы можем получить его значение

        //9.1 Пример, поиск min значения через Optional
        System.out.println("9.1 Пример, поиск min значения через Optional:");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 1));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("min элемент: " + min.get());
        System.out.println();

        //9.2 Если список пустой, то программа выдаст исключение java.util.NoSuchElementException
        System.out.println("9.2 Если список пустой, то программа выдаст исключение java.util.NoSuchElementException:");
        //Optional<Integer> integerStream = Stream.of(0, null).min(Integer::compareTo);
        //System.out.println(integerStream.get());
        System.out.println();

        //9.3 Метод isPresent()
        //Самой простой способ избежать подобной ситуации - это предварительная проверка наличия значения в Optional с помощью метода isPresent().
        //Он возврашает true, если значение присутствует в Optional, и false, если значение отсутствует
        System.out.println("9.3 Метод isPresent():");
        ArrayList<Integer> nullList = new ArrayList<Integer>();
        Optional<Integer> min3 = nullList.stream().min(Integer::compare);
        if (min3.isPresent()) {
            System.out.println(min3.get());
        } else {
            System.out.println("min3 value is null");
        }
        System.out.println();

        //9.4 Метод orElse
        //Метод orElse() позволяет определить альтернативное значение, которое будет возвращаться, если Optional не получит из потока какого-нибудь значения
        System.out.println("9.4 Метод orElse (пустой список):");
        ArrayList<Integer> numbers4 = new ArrayList<Integer>();
        Optional<Integer> min4 = numbers4.stream().min(Integer::compare);
        System.out.println(min4.orElse(-1)); // -1
        System.out.println();

        System.out.println("9.4 Метод orElse (непустой список):");
        numbers4.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
        min = numbers4.stream().min(Integer::compare);
        System.out.println(min.orElse(-1)); // 4
        System.out.println();

        //9.5 Метод orElseGet
        //Метод orElseGet() позволяет задать функцию, которая будет возвращать значение по умолчанию
        System.out.println("9.5 Метод orElseGet:");
        ArrayList<Integer> numbers5 = new ArrayList<>();
        Optional<Integer> min5 = numbers5.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println("min5: " + min5.orElseGet(() -> rnd.nextInt(100)));
        System.out.println();

        //9.6 Метод orElseThrow
        //Метод orElseThrow позволяет сгенерировать исключение, если Optional не содержит значения
        System.out.println("9.6 Метод orElseThrow:");
        ArrayList<Integer> numbers6 = new ArrayList<Integer>();
        Optional<Integer> min6 = numbers6.stream().min(Integer::compare);
        // генеррация исключения IllegalStateException
        //System.out.println(min6.orElseThrow(IllegalStateException::new));
        System.out.println();

        //9.7 Метод ifPresent()
        //Метод ifPresent() определяет действия со значением в Optional, если значение имеется
        System.out.println("9.7 Метод ifPresent():");
        ArrayList<Integer> numbers7 = new ArrayList<Integer>();
        numbers7.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
        Optional<Integer> min7 = numbers7.stream().min(Integer::compare);
        min7.ifPresent(v -> System.out.println(v)); // 4
        System.out.println();

        //9.8 Метод ifPresentOrElse()
        //Метод ifPresentOrElse() позволяет определить альтернативную логику на случай, если значение в Optional отсутствует
        //В метод ifPresentOrElse передается две функции:
        //Первая обрабатывает значение в Optional, если оно присутствует.
        //Вторая функция представляет действия, которые выполняются, если значение в Optional отсутствует.
        System.out.println("9.8 Метод ifPresentOrElse():");
        ArrayList<Integer> numbers8 = new ArrayList<Integer>();
        Optional<Integer> min8 = numbers8.stream().min(Integer::compare);
        min8.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );
        System.out.println();
    }
}
