package ru.begletsov.equals_hashcode;

import java.util.List;
import java.util.Objects;

/**
 * Класс BlackBox тестирование методов equals, hashCode для классов
 * 1) создание класса 2) добавил метод findObkectBlackBox по поиску коробки по hashCode
 * @author Sergei Begletsov
 * @since 27.07.2020
 * @version 2
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

    public static void findObkectBlackBox() {
        List<BlackBox> blackBoxList = List.of(
                new BlackBox(12, 34),
                new BlackBox(13, 22),
                new BlackBox(14, 45),
                new BlackBox(15, 67),
                new BlackBox(10, 10),
                new BlackBox(16, 89)
        );
        BlackBox BoxA = new BlackBox(10,10);

        for (BlackBox blackBox: blackBoxList) {
            if (blackBox.hashCode() == BoxA.hashCode()) {
                if (blackBox.equals(BoxA)) {
                    System.out.println("Коробка <BoxA> найдена! Box.hash = " + BoxA.hashCode());
                }
            } else {
                System.out.println("Коробка не совпала. Box.hash = " + blackBox.hashCode());
            }
        }
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
        //BlackBox.showEqualsBlackBoxObjectAandB();
        BlackBox.findObkectBlackBox();
    }
}
