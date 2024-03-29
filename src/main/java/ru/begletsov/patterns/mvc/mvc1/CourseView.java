package ru.begletsov.patterns.mvc.mvc1;

/**
 * == Уровень представления ==
 * Этот уровень шаблона проектирования MVC представляет выходные данные приложения или пользовательского интерфейса.
 * Он отображает данные, извлеченные из слоя модели контроллером, и представляет данные пользователю при каждом запросе.
 * Он получает всю необходимую информацию от контроллера и ему не нужно напрямую взаимодействовать с бизнес-уровнем.
 */

public class CourseView {
    public void printCourseDetails(String CourseName, String CourseId, String CourseCategory){
        System.out.println("Course Details: ");
        System.out.println("Name: " + CourseName);
        System.out.println("Course ID: " + CourseId);
        System.out.println("Course Category: " + CourseCategory);
    }
}
