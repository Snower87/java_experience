package ru.begletsov.modif_access.package_P1;

public class Base {
    private     int priv = 0;
                int def = 0;
    protected   int prot = 0;
    public      int publ = 0;

    private void privateMethod() {
        System.out.println("Class Base: privateMethod() execute");
    }

            void defaultMethod() {
        System.out.println("Class Base: defaultMethod() execute");
    }

    protected void protectedMethod() {
        System.out.println("Class Base: protectedMethod() execute");
    }

    public void publicMethod() {
        System.out.println("Class Base: publicMethod() execute");
    }
}
