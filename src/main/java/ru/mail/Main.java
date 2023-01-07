package ru.mail;

public class Main {
    public static void main(String[] args) {
        //целые числа
        byte varByte = 1; // -128 ... 127
        short varShort = 1; //-32768 ... 32767
        //must have
        int varInt = 1;
        long varLong = 1L;

        //числа с плавающей точкой
        float varFloat = 0.0f;
        //must have
        double varDouble = 0.0d;

        //логический
        boolean varBool = true;

        //символьный
        char varChar = 'с';

        //ссылочные (объектные) типы данных - классы
        String varString = "Hello, qa.guru";

        //ОПЕРАТОРЫ
        //1. Присвоения
        int varInt0 = 0;
        int varInt0 += 10; //используется в краткой форме редко

        //2. Математические (+, -, *, /, %, ++, --)
        varInt0 = 7 / 4; //в java деление - целочисленное, то есть остаток будет выброшен
        varInt0 = 7 % 4; //остаток от деления, тут 3
        varInt0 = ++varInt; //префиксная запись инкремента
        varInt0 = varInt--; //постфиксная запись декремента

        //3. Сравнения (>, <, >=, <=, !=, ==)
        if (1 == 1) // не используется для ссылочных типов

        //4. Логические операторы (И &&, ИЛИ ||, не !)
        if ((age >= 30) && (sex.equals("female")))
        if (!((age >= 30) && (sex.equals("female")))) //изменяет true на false

        if (varString != null && varString.length() == 10) {
            System.out.println(varString);
        } else {
            System.out.println("Извините, строка не из 10 символов");
        }



        System.out.println("Hello, qa.guru");

    }
}