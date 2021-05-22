package ru.begletsov.job4j_tasks._133_collections_map_hashmap;

import java.util.*;

/**
 * @Задание 13. Данные об осадках
 * @Раздел 1.3.3. Map. HashMap. LinkedHashMap
 * @Описание Метод принимает список объектов Info. При это эти объекты содержат два поля:
 * 1. city - название города, где производились наблюдения;
 * 2. rainfall - количество осадков которые выпали в этом городе за период наблюдения.
 * Необходимо реализовать метод так, чтобы в результате вернулся список объектов Info в котором будет указано:
 * имя города наблюдения и общее количество осадков за период наблюдения.
 * @author Sergei Begletsov
 * @since 22.05.2021
 * @version 1
 */

public class Weather_13 {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        //Вариант №1
        for (Info info:
             list) {
            String key = info.getCity();
            Integer value = info.getRainfall();
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else {
                map.put(key, map.get(key) + value);
            }
        }
        for (String city:
             map.keySet()) {
            rsl.add(new Info(city, map.get(city)));
        }
        return rsl;
    }

    public static class Info {
        private String city;
        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
