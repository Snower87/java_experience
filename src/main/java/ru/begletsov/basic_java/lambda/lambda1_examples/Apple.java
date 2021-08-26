package ru.begletsov.basic_java.lambda.lambda1_examples;

import java.util.Objects;

/**
 * Apple - класс-данных с цветом яблока
 */

public class Apple {
    private COLOR color;

    public Apple(COLOR color) {
        this.color = color;
    }

    public COLOR getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    enum COLOR {RED, GREEN}
}
