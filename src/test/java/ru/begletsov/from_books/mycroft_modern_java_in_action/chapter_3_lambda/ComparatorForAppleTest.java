package ru.begletsov.from_books.mycroft_modern_java_in_action.chapter_3_lambda;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class ComparatorForAppleTest {
    @Test
    public void whenFind5RedApples() {
        //1. Входные данные
        List<Apple> appleList = Arrays.asList(
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 10, 3.3),
                new Apple(COLOR.GREEN, 9, 5.12)
        );
        ComparatorForApple comparatorForApple = new ComparatorForApple(appleList);
        Predicate<Apple> predicateColorRED = apple -> apple.getColor().equals(COLOR.RED);

        //2. Ожидаемое значение
        List<Apple> expected = Arrays.asList(
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 5, 6.7)
        );

        //3. Результат сравнения
        assertThat(comparatorForApple.find(predicateColorRED), is(expected));
    }

    @Test
    public void whenFind5GreenApples() {
        //1. Входные данные
        List<Apple> appleList = Arrays.asList(
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 10, 3.3),
                new Apple(COLOR.GREEN, 9, 5.12)
        );
        ComparatorForApple comparatorForApple = new ComparatorForApple(appleList);
        Predicate<Apple> predicateColorGREEN = apple -> apple.getColor().equals(COLOR.GREEN);

        //2. Ожидаемое значение
        List<Apple> expected = Arrays.asList(
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.GREEN, 10, 3.3),
                new Apple(COLOR.GREEN, 9, 5.12)
        );

        //3. Результат сравнения
        assertThat(comparatorForApple.find(predicateColorGREEN), is(expected));
    }

    @Test
    //сортировка по возрастанию ID (через анонимный класс-компаратор)
    public void whenSortAppleByAscIdVer1AC() {
        //1. Входные данные
        List<Apple> appleList = Arrays.asList(
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 10, 3.3),
                new Apple(COLOR.GREEN, 9, 5.12)
        );
        ComparatorForApple comparatorForApple = new ComparatorForApple(appleList);

        //2. Ожидаемое значение
        List<Apple> expected = Arrays.asList(
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.GREEN, 9, 5.12),
                new Apple(COLOR.GREEN, 10, 3.3)
        );
        comparatorForApple.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple apple1, Apple apple2) {
                return apple1.getId() - apple2.getId();
            }
        });

        //3. Результат сравнения
        assertThat(comparatorForApple.getApples(), is(expected));
    }

    @Test
    //сортировка по возрастанию ID (через ссылку на метод)
    public void whenSortAppleByAscIdVer2RM() {
        //1. Входные данные
        List<Apple> appleList = Arrays.asList(
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 10, 3.3),
                new Apple(COLOR.GREEN, 9, 5.12)
        );
        ComparatorForApple comparatorForApple = new ComparatorForApple(appleList);
        Comparator<Apple> compAscById = Comparator.comparingInt(Apple::getId);

        //2. Ожидаемое значение
        List<Apple> expected = Arrays.asList(
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.GREEN, 9, 5.12),
                new Apple(COLOR.GREEN, 10, 3.3)
        );
        comparatorForApple.sort(compAscById);

        //3. Результат сравнения
        assertThat(comparatorForApple.getApples(), is(expected));
    }


    @Test
    //сортировка по возрастанию ID (через лямбда)
    public void whenSortAppleByAscIdVer3Lambda() {
        //1. Входные данные
        List<Apple> appleList = Arrays.asList(
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 10, 3.3),
                new Apple(COLOR.GREEN, 9, 5.12)
        );
        ComparatorForApple comparatorForApple = new ComparatorForApple(appleList);
        Comparator<Apple> compAscById = (apple1, apple2) -> Integer.compare(apple1.getId(), apple2.getId());

        //2. Ожидаемое значение
        List<Apple> expected = Arrays.asList(
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.GREEN, 9, 5.12),
                new Apple(COLOR.GREEN, 10, 3.3)
        );
        comparatorForApple.sort(compAscById);

        //3. Результат сравнения
        assertThat(comparatorForApple.getApples(), is(expected));
    }
}