package ru.mail;

public class Main {
    public static void main(String[] args) {
        byte varByte1 = -128;
        System.out.println((byte) (varByte1 - 1));

        short varShort1 = 32767;
        System.out.println((short) (varShort1 + 1));

        int varInt1 = 2147483647;
        System.out.println(varInt1 + 1);

        long varLong1 = -9223372036854775808L;
        System.out.println(varLong1 - 1L);

        float varFloat1 = Float.MAX_VALUE;
        System.out.println(varFloat1 + varFloat1);

        double varDouble1 = Double.MAX_VALUE;
        System.out.println(- varDouble1 - varDouble1);

        char varChar1 = 'k';
        if (varChar1 == 'u') {
            System.out.println("Буква u");
        } else {
            System.out.println("Что-то другое");
        }

        System.out.println(varShort1 < varInt1);

        int varInt2 = 100;
        double varDouble2 = 10.1d;
        System.out.println(varInt2 + varDouble2);
        System.out.println(varInt2 - varDouble2);
        System.out.println(varInt2 * varDouble2);
        System.out.println(varInt2 / varDouble2);
    }
}