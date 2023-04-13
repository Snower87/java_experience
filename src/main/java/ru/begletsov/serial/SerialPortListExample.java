package ru.begletsov.serial;

import jssc.SerialPortList;

public class SerialPortListExample {
    public static void main(String[] args) {
        String[] portNames = SerialPortList.getPortNames();
        for (String str: portNames) {
            System.out.println(str);
        }
    }
}
