package ru.begletsov.patterns.singleton.single1;

public class Singleton1 {
    private static Singleton1 instance;

    public Singleton1() {
        System.out.println("Constructor pattern Singleton");
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
            System.out.println("First create Singleton1 in getInstance()");
        } else {
            System.out.println("Obj Singleton1 already exist!!");
        }
        return instance;
    }
}
