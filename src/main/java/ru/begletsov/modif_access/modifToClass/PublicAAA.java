package ru.begletsov.modif_access.modifToClass;

public class PublicAAA {
    public static void main(String[] args) {
        PrivateBBB privateBBB = new PrivateBBB();
        //модификатор доступа для классов с модификаторами:
        //private, protected, default - один и тот же.
        //в данном пакете  - объекты класса PrivateBBB создаваться будут,
        //а в соседнем пакете - уже нет
    }
}
