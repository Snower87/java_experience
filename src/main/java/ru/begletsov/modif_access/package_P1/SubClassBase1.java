package ru.begletsov.modif_access.package_P1;

public class SubClassBase1 extends Base {
    public void f(Base a) {
        //priv = 2; //нет доступа
        def = 2;
        publ = 2;
        prot = 2;

        //a.priv = 2; //нет доступа
        a.def = 2;
        a.publ = 2;
        a.prot = 2;

        //System.out.println("base.priv = " + base.priv); //нет доступа
        System.out.println("base.def = " + a.def);
        System.out.println("base.prot = " + a.prot);
        System.out.println("base.publ = " + a.publ);

        //base.privateMethod(); //нет доступа
        a.defaultMethod();
        a.protectedMethod();
        a.publicMethod();
    }

    public static void main(String[] args) {
        Base base = new Base();
        SubClassBase1 subClassBase1 = new SubClassBase1();

        //System.out.println("base.priv = " + base.priv); //нет доступа
        System.out.println("base.def = " + base.def);
        System.out.println("base.prot = " + base.prot);
        System.out.println("base.publ = " + base.publ);

        subClassBase1.f(base);

        //System.out.println("base.priv = " + base.priv); //нет доступа
        System.out.println("base.def = " + base.def);
        System.out.println("base.prot = " + base.prot);
        System.out.println("base.publ = " + base.publ);

        //base.privateMethod(); //нет доступа
        base.defaultMethod();
        base.protectedMethod();
        base.publicMethod();
    }
}
