package ru.begletsov.patterns.mvc.mvc1;

/**
 * == Слой модели ==
 * В шаблоне проектирования MVC модель представляет собой уровень данных, который определяет бизнес-логику системы,
 * а также представляет состояние приложения. Объекты модели получают и сохраняют состояние модели в базе данных.
 */

public class Course {
    private String CourseName;
    private String CourseId;
    private String CourseCategory;

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public String getCourseCategory() {
        return CourseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        CourseCategory = courseCategory;
    }
}
