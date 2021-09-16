package ru.begletsov.basic_java.stream.college_exams;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CollegeTest {
    Student st1 = new Student("Student", "000001", "2021-09-15");
    Student st2 = new Student("Nadia", "000002", "2021-09-15");
    Student st3 = new Student("Petr", "000003", "2021-09-16");
    Student st4 = new Student("Lena", "000004", "2021-09-16");
    Student st5 = new Student("Nina", "000005", "2021-09-17");
    Student st6 = new Student("Sergei", "000006", "2020-08-28");
    Student st7 = new Student("Leonid", "000007", "2020-06-13");
    Student st8 = new Student("Zina", "000008", "2019-07-20");
    Student st9 = new Student("Dima", "000009", "2020-09-16");

    Map<Student, Set<Subject>> students = Map.of(
            st1, Set.of(
                    new Subject("Math", 70),
                    new Subject("English", 85),
                    new Subject("Informatics", 70),
                    new Subject("Biology", 30),
                    new Subject("History", 40)
            ),
            st2, Set.of(
                    new Subject("Math", 35),
                    new Subject("English", 72),
                    new Subject("Informatics", 40),
                    new Subject("Biology", 80),
                    new Subject("History", 90)
            ),
            st3, Set.of(
                    new Subject("Math", 90),
                    new Subject("English", 48),
                    new Subject("Informatics", 60),
                    new Subject("Biology", 30),
                    new Subject("History", 80)
            ),
            st4, Set.of(
                    new Subject("Math", 42),
                    new Subject("English", 67),
                    new Subject("Informatics", 30),
                    new Subject("Biology", 70),
                    new Subject("History", 50)
            ),
            st5, Set.of(
                    new Subject("Math", 98),
                    new Subject("English", 98),
                    new Subject("Informatics", 95),
                    new Subject("Biology", 95),
                    new Subject("History", 95)
            ),
            st6, Set.of(
                    new Subject("Math", 30),
                    new Subject("English", 30),
                    new Subject("Informatics", 30),
                    new Subject("Biology", 30),
                    new Subject("History", 30)
            ),
            st7, Set.of(
                    new Subject("Math", 80),
                    new Subject("English", 90),
                    new Subject("Informatics", 80),
                    new Subject("Biology", 80),
                    new Subject("History", 80)
            ),
            st8, Set.of(
                    new Subject("Math", 20),
                    new Subject("English", 20),
                    new Subject("Informatics", 20),
                    new Subject("Biology", 20),
                    new Subject("History", 20)
            ),
            st9, Set.of(
                    new Subject("Math", 60),
                    new Subject("English", 60),
                    new Subject("Informatics", 60),
                    new Subject("Biology", 60),
                    new Subject("History", 60)
            )
    );

    @Test
    public void testFindByAccount() {
        College college = new College(students);
        Student student = college.findByAccount("000002");

        String exp = "Nadia";
        assertThat(exp, is(student.getName()));
    }

    @Test
    public void testFindBySubjectName() {
        College college = new College(students);
        Subject subject = college.findBySubjectName("000002","English");

        int exp = 72;
        assertThat(exp, is(subject.getScore()));
    }

    @Test
    public void sumScoreSt1() {
        //1. Входные данные
        College college = new College(students);
        double sumScore = college.sumScoreStudent(st1.getAccount());

        //2. Ожидаемое значение
        double exp = 295;

        //3. Результат сравнения
        assertEquals(exp, sumScore, 0.01);
    }

    @Test
    public void averageScoreSt1() {
        //1. Входные данные
        College college = new College(students);
        double averScore = college.averageScoreStudent(st1.getAccount());

        //2. Ожидаемое значение
        double exp = 59;

        //3. Результат сравнения
        assertEquals(exp, averScore, 0.01);
    }

    @Test
    public void averageScoreSt8() {
        //1. Входные данные
        College college = new College(students);
        double averScore = college.averageScoreStudent(st8.getAccount());

        //2. Ожидаемое значение
        double exp = 20;

        //3. Результат сравнения
        assertEquals(exp, averScore, 0.01);
    }

    @Test
    public void averageScoreForAllSubject() {
        //1. Входные данные
        College college = new College(students);
        Map<String, Double> averScoreForAllSubj = college.averageScoreForAllSubject();

        Map<String, Double> exp = Map.of(
                "Math", 58.33D,
                "English", 63.33D,
                "Informatics", 53.88D,
                "Biology", 55.0D,
                "History", 60.55D
        );

        assertEquals(exp.get("Math"), averScoreForAllSubj.get("Math"), 0.01);
        assertEquals(exp.get("English"), averScoreForAllSubj.get("English"), 0.01);
        assertEquals(exp.get("Informatics"), averScoreForAllSubj.get("Informatics"), 0.01);
        assertEquals(exp.get("Biology"), averScoreForAllSubj.get("Biology"), 0.01);
        assertEquals(exp.get("History"), averScoreForAllSubj.get("History"), 0.01);
    }

    @Test
    public void averageScoreForCurrentSubject() {
        //1. Входные данные
        College college = new College(students);
        Double averScoreForAllSubj = college.averageScoreForCurrentSubject("Biology");

        Double expScoreBiology = 55.0D;

        assertEquals(expScoreBiology, averScoreForAllSubj, 0.01);
    }
}