package ru.begletsov.basic_java.stream.college_exams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Класс-сервис College
 * 1) создание класса (#124)
 * @author Sergei Begletsov
 * @since 16.09.2021
 * @version 1
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

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "2021-09-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                ), new Student("Nadia", "000002", "2021-09-15"),
                Set.of(
                        new Subject("Math", 35),
                        new Subject("English", 72)
                ), new Student("Petr", "000003", "2021-09-16"),
                Set.of(
                        new Subject("Math", 90),
                        new Subject("English", 48)
                ), new Student("Lena", "000004", "2021-09-16"),
                Set.of(
                        new Subject("Math", 42),
                        new Subject("English", 67)
                ), new Student("Nina", "000005", "2021-09-17"),
                Set.of(
                        new Subject("Math", 98),
                        new Subject("English", 98)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount("000001");
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName("000001", "English");
        System.out.println("Оценка по найденному предмету: " + english.getScore());
    }
}
