package ru.begletsov.basic_java.lambda.lambda1_examples;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Apple.COLOR.GREEN);
    }
}
