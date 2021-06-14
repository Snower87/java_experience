package ru.begletsov.patterns.builder.builder2;

public enum Brand {
    BMW, AUDI, MERCEDES, OPEL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
