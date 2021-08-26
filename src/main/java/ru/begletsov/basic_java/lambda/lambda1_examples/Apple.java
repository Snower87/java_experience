package ru.begletsov.basic_java.lambda.lambda1_examples;

import java.util.Objects;

/**
 * Apple - класс-данных с цветом яблока 1) создание класса 2) добавил id-яблока
 * @author Sergei Begletsov
 * @since 26.08.2021
 * @version 2
 */

public class Apple {
    private COLOR color;
    private int id;

    public Apple(COLOR color, int id) {
        this.color = color;
        this.id = id;
    }

    public COLOR getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return id == apple.id &&
                color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, id);
    }

    enum COLOR {RED, GREEN}
}
