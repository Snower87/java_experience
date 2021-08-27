package ru.begletsov.basic_java.lambda.lambda1_examples;

public class AppleIdMore3Predicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getId() >= 3;
    }
}
