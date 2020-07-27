package ru.begletsov.equals_hashcode;

import java.util.Objects;

/**
 * Класс Student тестирование методов equals, hashCode для классов
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 27.07.2020
 * @version 1
 */

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void showEqualsAndHashcodeObjectUser() {
        Student studVasia = new Student("Vasia", 19);
        Student studVasia2 = new Student("Vasia", 19);
        Student studPetya = new Student("Petya", 20);
        Student studKirill = new Student("Kirill", 22);

        //hashcode ДО переопределения:
        System.out.println();
        System.out.println("hashcode ДО переопределения:");
        System.out.println("hashcode studVasia: "  + studVasia.hashCode());  //1072408673
        System.out.println("hashcode studVasia2: " + studVasia2.hashCode()); //1531448569
        System.out.println("hashcode studPetya: "  + studPetya.hashCode());  //1867083167
        System.out.println("hashcode studKirill: " + studKirill.hashCode()); //1915910607

        //equals ДО переопределения:
        System.out.println();
        System.out.println("equals ДО переопределения:");
        System.out.println("equals studVasia -> studVasia: "   + studVasia.equals(studVasia));  //true
        System.out.println("equals studVasia -> studVasia2: "  + studVasia.equals(studVasia2)); //false
        System.out.println("equals studVasia -> studPetya: "   + studVasia.equals(studPetya));  //false
        System.out.println("equals studPetya -> studPetya: "   + studPetya.equals(studPetya));  //true
        System.out.println("equals studVasia -> studKirill: "  + studVasia.equals(studKirill)); //false

        //hashcode ПОСЛЕ переопределения:
        System.out.println();
        System.out.println("hashcode ПОСЛЕ переопределения:");
        System.out.println("hashcode studVasia: "  + studVasia.hashCode());  //-1739747916
        System.out.println("hashcode studVasia2: " + studVasia2.hashCode()); //-1739747916 (поменялось)
        System.out.println("hashcode studPetya: "  + studPetya.hashCode());  //-1907783570
        System.out.println("hashcode studKirill: " + studKirill.hashCode()); //957877762

        //equals ПОСЛЕ переопределения:
        System.out.println();
        System.out.println("equals ПОСЛЕ переопределения:");
        System.out.println("equals studVasia -> studVasia: "   + studVasia.equals(studVasia));  //true
        System.out.println("equals studVasia -> studVasia2: "  + studVasia.equals(studVasia2)); //true (поменялось)
        System.out.println("equals studVasia -> studPetya: "   + studVasia.equals(studPetya));  //false
        System.out.println("equals studPetya -> studPetya: "   + studPetya.equals(studPetya));  //true
        System.out.println("equals studVasia -> studKirill: "  + studVasia.equals(studKirill)); //false
    }

    public static void showEqualsAndHashcodeString() {
        String strObjA = new String("Bee or not to be");
        String strObjB = new String("Bee or not to be");
        String strA = "Bee or not to be";
        String strB = "Bee or not to be";

        //считаем hashcode строк String (без переопределения):
        System.out.println();
        System.out.println("считаем hashcode строк String (без переопределения):");
        System.out.println("hashcode strA: "  + strA.hashCode());  //-1431854724
        System.out.println("hashcode strB: "  + strB.hashCode());  //-1431854724
        System.out.println("hashcode strObjA: "  + strObjA.hashCode());  //-1431854724
        System.out.println("hashcode strObjB: "  + strObjB.hashCode());  //-1431854724

        //проверяем equals:
        System.out.println();
        System.out.println("equals String:");
        System.out.println("equals strA -> strA: " + strA.equals(strA)); //true
        System.out.println("equals strA -> strA: " + strA.equals(strB)); //true
        System.out.println("equals strA -> strA: " + strA.equals(strObjA)); //true

        System.out.println();
        System.out.println("equals new String:");
        System.out.println("equals strObjA -> strObjA: " + strObjA.equals(strObjA)); //true
        System.out.println("equals strObjA -> strObjB: " + strObjA.equals(strObjB)); //true
        System.out.println("equals strObjA -> strA: " + strObjA.equals(strA)); //true
        System.out.println("equals strObjA -> strB: " + strObjA.equals(strB)); //true
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        //Student.showEqualsAndHashcodeObjectUser();
        Student.showEqualsAndHashcodeString();
    }
}
