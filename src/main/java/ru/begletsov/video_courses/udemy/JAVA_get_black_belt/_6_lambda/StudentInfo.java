package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._6_lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * = Папка 6. Lambda выражения =
 * ---> Урок 1. Lambda выражения
 * @author Sergei Begletsov
 * @since 04.10.2021
 * @version 1
 */

public class StudentInfo {

    void testStudents(List<Student> studentList, StudentChecks sc) {
        for (Student student: studentList) {
            if (sc.check(student)) {
                System.out.println(student);
            }
        }
    }

//    void printStudentsOverGrade(List<Student> studentList, double grade) {
//        for (Student student: studentList) {
//            if (student.avgGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(List<Student> studentList, int age) {
//        for (Student student: studentList) {
//            if (student.age > age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(List<Student> studentList, int age,  double grade, char sex) {
//        for (Student student: studentList) {
//            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.1);
        Student st5 = new Student("Marya", 'f', 23, 3, 9.4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        //1. Поиск/сортировка студентов через создание классов
//        StudentInfo info = new StudentInfo();
//        info.printStudentsOverGrade(students, 8.0);
//        System.out.println("------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("------------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');

        //2. Поиск/сортировка студентов через создание анонимных классов и лямбда-выражениях
        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        System.out.println("------<< anonimous class >>----");
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("------<< lambda >>---------");
        info.testStudents(students, (Student p) -> {return p.avgGrade < 8;});
        System.out.println("------------------");
        info.testStudents(students, (Student p) -> {return p.age < 30;});
        System.out.println("------------------");
        info.testStudents(students, (Student p) -> {return p.age > 20 && p.avgGrade < 9.5 && p.sex == 'f';});
        System.out.println("------------------");
    }
}
