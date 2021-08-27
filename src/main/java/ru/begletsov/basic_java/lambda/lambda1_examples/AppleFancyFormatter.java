package ru.begletsov.basic_java.lambda.lambda1_examples;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getColor() == Apple.COLOR.RED? "RED COLOR" : "GREEN COLOR";
        return "Fancy format: apple " + characteristic + ", id = " + apple.getId();
    }
}
