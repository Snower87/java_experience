package ru.begletsov.basic_java.lambda.lambda1_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/** FarmerApple - класс-сервис для хозяйства фермера 1) создание класса, добавление метода filterGreenApples() -
 * - с обходом всех элементов через цикл for 2) добавил методы getGreenApples(), getRedApples() + тесты к ним
 * 3) добавил метод filterGreenApples с поиском по нужному цвету 4) добавил метод filterGreenApples с множеством
 * непонятных пар-ов (пример bad параметризации) 5) добавил фильтрацию через Predicate
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 5
 */

public class FarmerApple {
    private List<Apple> apples;

    public FarmerApple(List<Apple> apples) {
        this.apples = apples;
    }

    /**
     * Получить общее кол-во яблок
     * @return кол-во всех яблок
     */
    public int getCountApples() {
        return apples.size();
    }

    /**
     * Получить кол-во зеленых яблок
     * @return кол-во зеленых яблок
     */
    public int getGreenApples() {
        return filterGreenApples().size();
    }

    /**
     * Получить кол-во красных яблок
     * @return кол-во красных яблок
     */
    public int getRedApples() {
        return getCountApples() - filterGreenApples().size();
    }

    /**
     * Фильтрация/поиск зеленых яблок путем обхода всех элементов черех цикл for
     * @return список зеленых яблок
     */
    public List<Apple> filterGreenApples() {
        List<Apple> rsl = new ArrayList<>();
        for (Apple apple: apples) {
            if (apple.getColor().equals(Apple.COLOR.GREEN)) {
                rsl.add(apple);
            }
        }
        return rsl;
    }

    /**
     * Фильтрация/поиск яблок необходимого цвета
     * @param color искомый цвет
     * @return список яблок "нужного" цвета
     */
    public List<Apple> filterGreenApples(Apple.COLOR color) {
        List<Apple> rsl = new ArrayList<>();
        for (Apple apple: apples) {
            if (apple.getColor().equals(color)) {
                rsl.add(apple);
            }
        }
        return rsl;
    }

    /**
     * Плохая фильтрация/поиск яблок необходимого цвета (пример плохой реализации)
     * @param color искомый цвет
     * @param id искомый идентификатор
     * @param flag флаг поиска (актуален/неактуален поиск)
     * @return список яблок по требуемым пар-ам
     */
    public List<Apple> filterGreenApples(Apple.COLOR color, double id, boolean flag) {
        List<Apple> rsl = new ArrayList<>();
        for (Apple apple: apples) {
            if (apple.getColor().equals(color) ||
                    (!flag && apple.getId() < 3)) {
                rsl.add(apple);
            }
        }
        return rsl;
    }

    /**
     * Фильтрация списка яблок через Predicate (тест)
     * @param predicate заданные условия
     * @return список яблок по необходимым условиям
     */
    public List<Apple> filterGreenApples(Predicate<Apple> predicate) {
        List<Apple> rsl = new ArrayList<>();
        for (Apple apple: apples) {
            if (predicate.test(apple)) {
                rsl.add(apple);
            }
        }
        return rsl;
    }

    /**
     * Фильтрация списка яблок через Predicate (тест)
     * @param predicate заданные условия
     * @return список яблок по необходимым условиям
     */
    public List<Apple> filterGreenApples(ApplePredicate predicate, String str) {
        List<Apple> rsl = new ArrayList<>();
        for (Apple apple: apples) {
            if (predicate.test(apple)) {
                rsl.add(apple);
            }
        }
        return rsl;
    }
}
