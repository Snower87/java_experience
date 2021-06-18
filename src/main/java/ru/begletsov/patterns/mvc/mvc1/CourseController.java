package ru.begletsov.patterns.mvc.mvc1;

/**
 * == Уровень контроллера ==
 * Контроллер похож на интерфейс между моделью и представлением. Он получает пользовательские запросы от уровня
 * представления и обрабатывает их, включая необходимые проверки. Затем запросы отправляются в модель для обработки данных.
 * После обработки данные снова отправляются обратно в контроллер, а затем отображаются в представлении.
 */

public class CourseController {
    private Course model;
    private CourseView view;

    public CourseController(Course model, CourseView view){
        this.model = model;
        this.view = view;
    }
    public void setCourseName(String name){
        model.setCourseName(name);
    }
    public String getCourseName(){
        return model.getCourseName();
    }
    public void setCourseId(String id){
        model.setCourseId(id);
    }
    public String getCourseId(){
        return model.getCourseId();
    }
    public void setCourseCategory(String category){
        model.setCourseCategory(category);
    }
    public String getCourseCategory(){
        return model.getCourseCategory();
    }
    public void updateView(){
        view.printCourseDetails(model.getCourseName(), model.getCourseId(), model.getCourseCategory());
    }
}
