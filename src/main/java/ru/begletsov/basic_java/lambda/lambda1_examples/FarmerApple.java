package ru.begletsov.basic_java.lambda.lambda1_examples;

import java.util.ArrayList;
import java.util.List;

/** FarmerApple - класс-сервис для хозяйства фермера 1) создание класса, добавление метода filterGreenApples() -
 * - с обходом всех элементов через цикл for 2) добавил методы getGreenApples(), getRedApples() + тесты к ним
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 2
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
        List<Apple>rsl = new ArrayList<>();
        for (Apple apple: apples) {
            if (apple.getColor().equals(Apple.COLOR.GREEN)) {
                rsl.add(apple);
            }
        }
        return rsl;
    }
}
