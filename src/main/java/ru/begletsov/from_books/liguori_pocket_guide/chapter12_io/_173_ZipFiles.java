package ru.begletsov.from_books.liguori_pocket_guide.chapter12_io;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//1. ZipOutputStream служит для упаковки архивных ZIP-файлов
//2. ZipInputStream - для распаковки ZIP-файлов

public class _173_ZipFiles {
    public static void main(String[] args) {
        //ZipOutputStream zipOut = null;
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("arch_24_10_21.zip"))) {
            System.out.println("1. Start archiving...");
            String[] fNames = new String[] {
                    "C:\\Users\\Sergei\\Desktop\\test_zip\\data0.PNG",
                    "C:\\Users\\Sergei\\Desktop\\test_zip\\data1.PNG",
                    "C:\\Users\\Sergei\\Desktop\\test_zip\\data2.PNG",
                    "C:\\Users\\Sergei\\Desktop\\test_zip\\data3.PNG",
                    "C:\\Users\\Sergei\\Desktop\\test_zip\\data4.PNG"
            };
            ZipEntry zipEntry = null;
            FileInputStream fins = null;
            for (int i = 0; i < fNames.length; i++) {
                System.out.println("2. Archiving file: " + fNames[i]);
                zipEntry = new ZipEntry(fNames[i]);
                fins = new FileInputStream(fNames[i]);
                try {
                    zipOut.putNextEntry(zipEntry);
                    for (int a = fins.read(); a != -1; a = fins.read()) {
                        zipOut.write(a);
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            fins.close();
            zipOut.close();
            System.out.println("3. Close fins, zipOut");
            System.out.println("4. Ens archiving...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
