package ru.begletsov.from_books.mycroft_modern_java_in_action.chapter_3_lambda;

import java.util.Objects;

/**
 * Apple - класс-данных с цветом яблока, id-яблока и его весом
 * @author Sergei Begletsov
 * @since 10.09.2021
 * @version 1
 */

public class Apple {
    private COLOR color;
    private int id;
    private double weight;

    public Apple(COLOR color, int id, double weight) {
        this.color = color;
        this.id = id;
        this.weight = weight;
    }

    public COLOR getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return id == apple.id &&
                Double.compare(apple.weight, weight) == 0 &&
                color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, id, weight);
    }
}
