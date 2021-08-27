package ru.begletsov.basic_java.lambda.lambda1_examples;

public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return "Simple method: " + "apple id (" + apple.getId() + "), " + "color = " + apple.getColor();
    }
}
