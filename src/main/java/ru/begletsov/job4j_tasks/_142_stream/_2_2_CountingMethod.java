package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Задание 2.2. Группировка элементов и подсчет количества. Метод counting()
 * @Раздел 1.4.2. Stream API
 * @Описание Метод Collectors.groupingBy() всегда первым параметром принимает функцию, по которой будет строиться ключ.
 * Вторым параметром может принимать Collector. Большинство методов Collectors возвращают Collector.
 * Рассмотрим метод Collectors.counting(), этот метод ничего не принимает, а просто подсчитывает количество элементов
 * определенной группы.
 * Например, напишем код, который будет возвращать Map<String, Long> ключ это строка, значение это число ее вхождений в список:
 * - List<String> strings = List.of("a", "b", "c", "b", "c", "c");
 * - strings.stream()
 *          .collect(Collectors.groupingBy(
 *                      Function.identity(),
 *                      Collectors.counting()
 *           )).forEach((k, v) -> System.out.println(k + " = " + v));
 * Вывод:
 * a = 1
 * b = 2
 * c = 3
 * Ваша задача подсчитать количество работников для каждой компании
 * @author Sergei Begletsov
 * @since 06.09.2021
 * @version 1
 */

public class _2_2_CountingMethod {
    public static class Company {
        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Worker {
        private int age;
        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        worker -> worker.getCompany().getName(),
                        Collectors.counting()
                ));
    }

    public static Map<Integer, Long> groupAndCountByAge(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        Worker::getAge,
                        Collectors.counting()
                ));
    }
}