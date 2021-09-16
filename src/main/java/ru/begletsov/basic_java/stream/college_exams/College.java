package ru.begletsov.basic_java.stream.college_exams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Класс-сервис College
 * 1) создание класса 2) добавил методы: averageScoreForSubject() - среднее значение баллов по конкретному предмету,
 * averageScoreForAllSubject() - средний балл для каждого экзамена по отдельности
 * @author Sergei Begletsov
 * @since 16.09.2021
 * @version 2
 */

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Поиска студента по аккаунту
     * @param account аккаунт студента
     * @return возвращает найденного студента или null
     */
    public Student findByAccount(String account) {
        return students.keySet().stream()
                .filter(student -> student.getAccount().equals(account))
                .findFirst()
                .orElse(null);
    }

    /**
     * Поиск предмета по аккаунту и имени предмета
     * @param account аккаунт студента
     * @param subject имени предмета
     * @return возвращает найденного предмет или null
     */
    public Subject findBySubjectName(String account, String subject) {
        Student student = findByAccount(account);
        return students.get(student).stream()
                .filter(nameSubject -> nameSubject.getName().equals(subject))
                .findFirst()
                .orElse(null);
    }

    /**
     * Общий (сумма) баллов по всем экзаменам у студента
     * @param account аккаунт студента
     * @return кол-во баллов
     */
    public double sumScoreStudent(String account) {
        Student student = findByAccount(account);
        return students.get(student).stream()
                .mapToDouble(Subject::getScore).sum();
    }

    /**
     * Средний балл по всем экзаменам
     * @param account аккаунт студента
     * @return средний балл
     */
    public double averageScoreStudent(String account) {
        Student student = findByAccount(account);
        return students.get(student).stream()
                .mapToInt(Subject::getScore).average().orElse(0);
                //.collect(Collectors.averagingDouble(subject -> subject.getScore()));
                //.collect(Collectors.averagingDouble(Subject::getScore));
    }

    /**
     * Средний балл по всем предметам
     * @return мапу со средним значением баллов по всем экзаменам
     */
    public Map<String, Double> averageScoreForAllSubject() {
        return students.values().stream()
                .flatMap(set -> set.stream())
                .collect(Collectors.groupingBy(
                        subject -> subject.getName(),
                        Collectors.averagingDouble(Subject::getScore)
                ));
    }

    /**
     * Средний балл по конкретному предмету
     * @return среднее значение по всем сданным абитуриентам
     */
    public Double averageScoreForCurrentSubject(String nameSubject) {
        return students.values().stream()
                .flatMap(set -> set.stream())
                .filter(subj -> subj.getName().equals(nameSubject))
                .collect(Collectors.averagingDouble(Subject::getScore));
    }
}
