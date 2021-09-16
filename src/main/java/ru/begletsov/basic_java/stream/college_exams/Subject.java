package ru.begletsov.basic_java.stream.college_exams;

import java.util.Objects;

/**
 * Класс Subject описывает изучаемый предмет, хранится имя предмета и оценка по нему.
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 16.09.2021
 * @version 1
 */

public class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
