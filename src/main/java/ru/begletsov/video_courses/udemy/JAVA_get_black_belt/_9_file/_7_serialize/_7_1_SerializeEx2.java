package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._9_file._7_serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _7_1_SerializeEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tiida", "white");
        Employee employee = new Employee("Maria", "IT", 28, 500, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("F://employees2.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
