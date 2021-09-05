package ru.begletsov.from_books.kouzen_modern_java.chapter_2._2_2_Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _2_5_example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mal", "Wash", "Kaylee", "Inara",
                "Zoё", "Jayne", "Simon", "River", "Shepherd Book");

        //Вариант 1
        Optional<String> first = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst();

        //1. Печатается Optional.empty
        System.out.println(first);

        //2. Печатается строка "None"
        System.out.println(first.orElse("None"));

        //3. Коллекция с запятой-разделителем строится, даже если имя найдено
        System.out.println(first.orElse(String.format("Ничего не найдено в %s",
                names.stream()
                        .collect(Collectors.joining(", ")))

        ));
        //4. Коллекция с запятой-разделителем строится, только когда Optional пусто
        System.out.println(first.orElse(String.format("Ничего не найдено в %s",
                names.stream()
                        .collect(Collectors.joining(", ")))
        ));
    }
}
