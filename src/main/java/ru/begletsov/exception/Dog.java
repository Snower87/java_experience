package ru.begletsov.exception;

/**
 * Класс Dog в котором будут обрабатываться исключения DogIsNotReadyException
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 12.08.2020
 * @version 1
 */

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("1. Ошейник надет!");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("2. Поводок надет!");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("3. Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("1) Собираемся на прогулку!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("2) Ура, идем гулять! " + name + " очень рад!");
        } else {
            throw new DogIsNotReadyException("3) Собака " + name + " не готова к прогулке! Проверьте экипировку!");
        }
    }

    public static void main(String[] args) {
        Dog rex = new Dog("Рекс");
        rex.putCollar();
        //rex.putLeash();
        rex.putMuzzle();
        try {
            rex.walk(); //Unhandled exception: DogIsNotReadyException
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем оснащение:");
            System.out.println("Ошейник надет? " + rex.isCollarPutOn);
            System.out.println("Поводок надет? " + rex.isLeashPutOn);
            System.out.println("Намордник надет? " + rex.isMuzzlePutOn);
        }
    }
}
