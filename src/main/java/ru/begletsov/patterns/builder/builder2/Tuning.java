package ru.begletsov.patterns.builder.builder2;

public enum Tuning {
    CHROME, LEATHER, WHITE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
