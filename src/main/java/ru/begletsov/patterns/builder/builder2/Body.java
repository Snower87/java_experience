package ru.begletsov.patterns.builder.builder2;

public enum Body {
    SEDAN, CABRIOLET, HATCHBACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
