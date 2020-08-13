package ru.begletsov.modif_access.package_P2;

import ru.begletsov.modif_access.package_P1.Base;

public class SubClassBase2 extends Base {
    public void f(Base a) {
        //priv = 4; //нет доступа
        //def = 4; //нет доступа
        publ = 4;
        prot = 4;

        //a.priv = 4; //нет доступа
        //a.def = 4; //нет доступа
        a.publ = 4;
        //a.prot = 2; //нет доступа

        //System.out.println("base.priv = " + base.priv); //нет доступа
        //System.out.println("base.def = " + a.def);
        //System.out.println("base.prot = " + a.prot);
        System.out.println("base.publ = " + a.publ);

        //base.privateMethod(); //нет доступа
        //a.defaultMethod();
        //a.protectedMethod();
        a.publicMethod();
    }
}
