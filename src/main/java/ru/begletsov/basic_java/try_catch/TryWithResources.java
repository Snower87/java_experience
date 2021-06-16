package ru.begletsov.basic_java.try_catch;

import java.io.*;

public class TryWithResources {
    //try-catch-finally
    public static void method1() {
        Reader reader = null;
        try {
            reader = new FileReader(new File("someFileName"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //try-with-resources, only for classes implementation Closeable
    //block finally not needed
    public static void method2() {
        try (Reader reader = new FileReader(new File("someFileName"));) {
            reader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //try-with-resources + add key word "throws" in signature method
    public static void method3() throws IOException {
        try (FileWriter fw = new FileWriter("datafile")) {
            fw.write("Information...");
        }
    }
}
