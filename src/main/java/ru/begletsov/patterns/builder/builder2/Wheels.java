package ru.begletsov.patterns.builder.builder2;

public enum Wheels {
    STEEL, SPORTS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
