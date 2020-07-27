package ru.begletsov.equals_hashcode;

import java.util.Objects;

/**
 * Класс BlackBox тестирование методов equals, hashCode для классов
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 27.07.2020
 * @version 1
 */

public class BlackBox {
    int varA;
    int varB;

    public static void showEqualsBlackBoxObjectAandB() {
        BlackBox blackA = new BlackBox(5, 10);
        BlackBox blackB = new BlackBox(5, 10);
        BlackBox copyBlackA = blackA;

        System.out.println("hashCode BlackBox Object ДО переопределения:");
        System.out.println("hashCode blackA: " + blackA.hashCode());         //1072408673
        System.out.println("hashCode blackB: " + blackB.hashCode());         //1531448569
        System.out.println("hashCode copyBlackA: " + copyBlackA.hashCode()); //1072408673

        System.out.println();
        System.out.println("equals BlackBox Object ДО переопределения:");
        System.out.println("equals blackA -> blackA: " + blackA.equals(blackA));         //true
        System.out.println("equals blackA -> blackB: " + blackB.equals(blackA));         //false
        System.out.println("equals blackA -> copyBlackA: " + blackA.equals(copyBlackA)); //true

        System.out.println();
        System.out.println("hashCode BlackBox Object ПОСЛЕ переопределения:");
        System.out.println("hashCode blackA: " + blackA.hashCode());         //1126
        System.out.println("hashCode blackB: " + blackB.hashCode());         //1126 (поменялось)
        System.out.println("hashCode copyBlackA: " + copyBlackA.hashCode()); //1126

        System.out.println();
        System.out.println("equals BlackBox Object ПОСЛЕ переопределения:");
        System.out.println("equals blackA -> blackA: " + blackA.equals(blackA));         //true
        System.out.println("equals blackA -> blackB: " + blackB.equals(blackA));         //true (поменялось)
        System.out.println("equals blackA -> copyBlackA: " + blackA.equals(copyBlackA)); //true
    }

    public BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlackBox blackBox = (BlackBox) o;
        return varA == blackBox.varA &&
                varB == blackBox.varB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(varA, varB);
    }

    public static void main(String[] args) {
        BlackBox.showEqualsBlackBoxObjectAandB();
    }
}
