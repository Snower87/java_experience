package ru.begletsov.modif_access.package_P1;

public class App1 {
    public void f() {
        Base base = new Base();
        //base.priv = 1; //нет доступа
        base.def = 1;
        base.prot = 1;
        base.publ = 1;

        //System.out.println("base.priv = " + base.priv); //нет доступа
        System.out.println("base.def = " + base.def);
        System.out.println("base.prot = " + base.prot);
        System.out.println("base.publ = " + base.publ);

        //base.privateMethod(); //нет доступа
        base.defaultMethod();
        base.protectedMethod();
        base.publicMethod();
    }

    public static void main(String[] args) {
        new App1().f();
    }
}
