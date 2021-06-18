package ru.begletsov.patterns.mvc.mvc1;

/**
 * << Преимущества архитектуры: >>
 * - Несколько разработчиков могут работать с тремя слоями (Модель, Вид и Контроллер) одновременно. Модульность.
 * - Обеспечивает улучшенную масштабируемость, которая дополняет способность приложения расти.
 * - Поскольку компоненты имеют низкую зависимость друг от друга, их легко поддерживать.
 * - Модель может быть повторно использована несколькими представлениями, что обеспечивает возможность повторного
 * использования кода.
 * - Принятие MVC делает приложение более выразительным и простым для понимания.
 * - Расширение и тестирование приложения становится легким.
 * --------------------------------------------------------------------------------------------------------
 * Для реализации веб-приложения на основе шаблона проектирования MVC мы создадим:
 * 1. Course Class, который выступает в качестве модельного слоя.
 * 2. CourseView Class, который определяет уровень представления (уровень представления).
 * 3. CourseContoller Class, который действует как контроллер.
 * --------------------------------------------------------------------------------------------------------
 * Приведенный класс MVCPatternDemo извлекает данные Course из функции, используя которую пользователь вводит набор значений.
 * Затем он помещает эти значения в модель Course. Затем он инициализирует представление, которое мы создали ранее в статье.
 * Кроме того, он также вызывает класс CourseController и связывает его с классом Course и классом CourseView.
 * Затем метод updateView(), являющийся частью контроллера, обновляет сведения о курсе на консоли.
 */

public class MVCPatternDemo {
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        Course model  = receiveCourseFromDatabase();
        //Create a view : to write course details on console
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();
        //update model data
        controller.setCourseName("Python");
        System.out.println("");
        System.out.println("nAfter updating, Course Details are as follows");
        controller.updateView();
    }

    private static Course receiveCourseFromDatabase(){
        Course course = new Course();
        course.setCourseName("Java");
        course.setCourseId("01");
        course.setCourseCategory("Programming");
        return course;
    }
}
