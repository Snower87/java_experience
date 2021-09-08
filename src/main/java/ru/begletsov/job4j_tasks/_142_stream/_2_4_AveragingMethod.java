package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Задание 2.4. Группировка элементов и среднее значение. Метод averagingDouble()
 * @Раздел 1.4.2. Stream API
 * @Описание Collectors.averagingDouble() подсчитывает среднее значение элементов в группе. В качестве аргумента
 * принимает функцию, в которой мы должны указать, как преобразовать элемент в double.
 * Ваша задача найти для каждой компании средний возраст сотрудников.
 * @author Sergei Begletsov
 * @since 08.09.2021
 * @version 1
 */

public class _2_4_AveragingMethod {
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

    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        worker -> worker.getCompany().getName(),
                        Collectors.averagingDouble(Worker::getAge)
                ));
    }
}
