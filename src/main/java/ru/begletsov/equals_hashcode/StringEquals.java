package ru.begletsov.equals_hashcode;

/**
 * Класс StringEquals тестирование на равенство объектов класса String
 * 1) создание класса 2) комментарий попровил
 * @author Sergei Begletsov
 * @since 28.07.2020
 * @version 1
 */

public class StringEquals {
    public static void main(String[] args) {
        String findAnimal = "dog";
        String dog = "dog";
        String cat = "cat";
        String bird = "bird";

        String dogString = new String( "dog");
        String dogString2 = new String( "dog");
        String catString = new String( "cat");
        String birdString = new String( "bird");

        System.out.print("findAnimal == dog? ");
        System.out.println(findAnimal == dog);
        System.out.print("findAnimal.equals(dog)? ");
        System.out.println(findAnimal.equals(dog));
        System.out.print("findAnimal.hashCode? ");
        System.out.println(findAnimal.hashCode());
        System.out.print("findAnimal.hashCode == dog.hashCode()? ");
        System.out.println(findAnimal.hashCode() == dog.hashCode());

        System.out.println();
        System.out.print("findAnimal == dogString? ");
        System.out.println(findAnimal == dogString);
        System.out.print("findAnimal.equals(dogString)? ");
        System.out.println(findAnimal.equals(dogString));
        System.out.print("dogString.hashCode? ");
        System.out.println(dogString.hashCode());
        System.out.print("findAnimal.hashCode == dogString.hashCode()? ");
        System.out.println(findAnimal.hashCode() == dogString.hashCode());

        System.out.println();
        System.out.print("dogString2 == dogString2? ");
        System.out.println(dogString2 == dogString);
        System.out.print("dogString2.equals(findAnimal)? ");
        System.out.println(dogString2.equals(findAnimal));
        System.out.print("dogString.hashCode? ");
        System.out.println(dogString2.hashCode());
        System.out.print("findAnimal.hashCode == dogString2.hashCode()? ");
        System.out.println(findAnimal.hashCode() == dogString2.hashCode());
        System.out.print("dogString.hashCode == dogString2.hashCode()? ");
        System.out.println(dogString.hashCode() == dogString2.hashCode());

    }
}
