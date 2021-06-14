package ru.begletsov.patterns.builder.builder2;

public enum Color {
    RED, GREEN, YELLOW, BLUE, BLACK, WHITE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
