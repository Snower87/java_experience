package ru.begletsov.collections.crud;

import ru.begletsov.equals_hashcode.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Class crudAtList CRUD (Create Read Update Delete) для коллекции List
 * 1) создание класса 2) добавил метод add(index, element) - добавление элемента со смещением
 * @author Sergei Begletsov
 * @since 30.07.2020
 * @version 1
 */

public class crudAtList {
    public static void showList(List list) {
        list.stream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        //1. Входные данные
        List<String> emailList = new ArrayList<>();
        emailList.add("first@yandex.ru");
        emailList.add("second@ymail.ru");
        emailList.add("third@bk.com");
        emailList.add("fourth@hh.ru");

        List<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Петя", 20));
        studentList.add(new Student("Ваня", 18));
        studentList.add(new Student("Саня", 17));
        studentList.add(new Student("Зина", 22));
        studentList.add(new Student("Надя", 18));
        studentList.add(null);
        studentList.add(null);

        //================================================================================
        // Методы работы со списом List:
        // 1) add(element) - добавление элемента в конец списка
        //    add(index, element) - добавление элемента со смещением
        // 2) get(index) - получение элемента по индексу
        // 3) indexOf(element) - получение индекса элемента для переданного элемента
        // 4) contains(element) - сообщает о присутствии элемента в коллекции
        // 5) set(index, new_value) - update, обновление данных по индексу
        // 6) remove(index/value) - удаление элемента по индексу/значению
        //================================================================================
        System.out.println("Работа с массивом List<String> emailList = new ArrayList<>();");
        System.out.print("1. Первый элемент ArrayList: ");
        System.out.println(emailList.get(0));
        System.out.print("2. Последний элемент ArrayList: ");
        System.out.println(emailList.get(emailList.size() - 1));
        System.out.print("3. Получение произвольного элемента ArrayList по индексу: ");
        System.out.println(emailList.get(2));
        System.out.print("4. Поиск индекса элемента \"third@bk.com\": ");
        System.out.println(emailList.indexOf("third@bk.com"));
        System.out.print("5. Поиск индекса элемента \"first@yandex.ru\": ");
        System.out.println(emailList.indexOf("first@yandex.ru"));
        System.out.print("6. Коллекция содержит элемент \"fourth@hh.ru\"? -> ");
        System.out.println(emailList.contains("fourth@hh.ru"));
        System.out.print("7. Коллекция содержит элемент \"111@hh.ru\"? -> ");
        System.out.println(emailList.contains("111@hh.ru"));
        System.out.println("8. Удаление элемента по индексу 0:");
        emailList.remove(0);
        System.out.println("Список после удаления:");
        showList(emailList);
        System.out.println("9. Удаление элемента по значению \"fourth@hh.ru\": ");
        emailList.remove("fourth@hh.ru");
        System.out.println("Список после удаления:");
        showList(emailList);
        System.out.println("10. Добавление новых элементов:");
        emailList.add("bunch78@gmail.com");
        emailList.add("sneg83@aol.ru");
        System.out.println("Список после добавления:");
        showList(emailList);
        System.out.println("11. Update, замена элементов по индексам 0, 1:");
        emailList.set(0, "error01");
        emailList.set(1, "error02");
        System.out.println("Список после замены:");
        showList(emailList);
        System.out.println("12. Добавление элемента по 0-му индексу:");
        emailList.add(0, "xottab@gmail.ru");
        System.out.println("Список после добавления по 0-му индексу:");
        showList(emailList);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Работа с массивом List<Student> studentList = new LinkedList<>();");
        System.out.print("1. Первый элемент ArrayList: ");
        System.out.println(studentList.get(0));
        System.out.print("2. Последний элемент ArrayList: ");
        System.out.println(studentList.get(studentList.size() - 1));
        System.out.print("3. Получение произвольного элемента ArrayList по индексу: ");
        System.out.println(studentList.get(2));
        System.out.print("4. Поиск индекса элемента Student(\"Петя\", 20): ");
        System.out.println(studentList.indexOf(new Student("Петя", 20)));
        System.out.print("5. Поиск индекса элемента Student(\"Зина\", 22): ");
        System.out.println(studentList.indexOf(new Student("Зина", 22)));
        System.out.print("6. Коллекция содержит элемент Student(\"Петя\", 20)? -> ");
        System.out.println(studentList.contains(new Student("Петя", 20)));
        System.out.print("7. Коллекция содержит элемент Student(\"Зина\", 222)? -> ");
        System.out.println(studentList.contains(new Student("Зина", 222)));
        System.out.println("8. Удаление элемента по индексу 0:");
        System.out.println(studentList.remove(0));
        System.out.println("Список после удаления:");
        showList(studentList);
        System.out.println("9.1 Удаление элемента по значению Student(\"Зина\", 22): ");
        System.out.println("9.2 Удаление null-элементов из списка: ");
        studentList.remove(new Student("Зина", 22));
        studentList.remove(studentList.indexOf(null));
        studentList.remove(studentList.indexOf(null));
        System.out.println("Список после удаления:");
        showList(studentList);
        System.out.println("10. Добавление новых элементов:");
        Student dima = new Student("Дима", 21);
        Student vova = new Student("Вова", 19);
        studentList.add(dima);
        studentList.add(vova);
        System.out.println("Список после добавления:");
        showList(studentList);
        System.out.println("11. Update, замена элементов по индексам 0, 1:");
        Student kolia = new Student("Коля", 24);
        Student vasia = new Student("Вася", 22);
        studentList.set(0, kolia);
        studentList.set(1, vasia);
        System.out.println("Список после замены:");
        showList(studentList);
        System.out.println("12. Добавление элемента по 0-му индексу:");
        studentList.add(0, new Student("Петрович", 42));
        System.out.println("Список после добавления по 0-му индексу:");
        showList(studentList);
    }
}
