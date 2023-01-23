package ru.mail;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] intArr0 = new int[3];
        int[] intArr1 = new int[] {5, 20, 50, 80};
        intArr0[0] = 1;
        intArr0[1] = 42;
        intArr0[2] = -100;
        int[][] twoDimensionalArray = new int[][]{intArr0, intArr1};
        String[] strArr0 = new String[5];
        System.out.println("Длина массива: " + intArr0.length);
        System.out.println("Длина массива: " + Arrays.toString(intArr0));

        for (int i = 0; i < intArr0.length; i++) {
            System.out.println(i + "-ый элемент массива: " + intArr0[i]);
        }

        for (int i = intArr0.length - 1; i >= 0; i--) {
            System.out.println(i + "-ый элемент массива: " + intArr0[i]);
        }

        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] == 50) {
                System.out.println("Нашли: " + intArr1[i]);
                break;
            }
            System.out.println("Next iteration");
        }

        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] != 50) {
                continue;
            }
            System.out.println("Нашли: " + intArr1[i]);
            System.out.println("А итерации, выведенные на экран: " + intArr1[i]);
            break;
        }

        for (int element : intArr0) {
            if (element == 42) {
                System.out.println("Нашли: " + element);
                break;
            }
            System.out.println("n i ");
        }

        System.out.println("Двумерный массив");

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            int[] arr = twoDimensionalArray[i];
            for (int a = 0; a < arr.length; a++) {
                if (arr[a] == 42) {
                    System.out.println("Нашли: " + arr[a]);
                    break;
                }
                System.out.println("n i ");
            }
        }

        List<Integer> intList0 = new ArrayList<>();
        intList0.add(1);

        List<Integer> intList1 = List.of(5, 20, 50, 80);
        intList1.remove((Integer) 5);

        List<Integer> intList2 = List.of(30, 31, 40, 90);
        intList1.stream()
                .filter(e -> e == 40)
                .findFirst()
                .orElseThrow();

        List<List<String>> intList3 = List.of(
                List.of("df", "42", "100"),
                List.of("sdf", "427", "104350")
        );

        Set<String> stringSet0 = Set.of("Dima", "Vasya");
        stringSet0.remove("Dima");

        Set<String> stringSet1 = new HashSet<>();

        Map<String, Integer> aMap0 = new HashMap<>();

        Map<String, People> aMap1 = Map.of(
                "1234", new People(),
                "5234", new People()
        );

        Set<String> keySet = aMap1.keySet();
        Collection<People> values = aMap1.values();
        Set<Map.Entry<String, People>> entries = aMap1.entrySet();
        for (Map.Entry<String, People> entry: entries) {
            if (entry.getKey().equals("5234")) {
                entry.getValue().sayRespect();
            }
        }


//        byte varByte1 = -128;
//        System.out.println((byte) (varByte1 - 1));
//
//        short varShort1 = 32767;
//        System.out.println((short) (varShort1 + 1));
//
//        int varInt1 = 2147483647;
//        System.out.println(varInt1 + 1);
//
//        long varLong1 = -9223372036854775808L;
//        System.out.println(varLong1 - 1L);
//
//        float varFloat1 = Float.MAX_VALUE;
//        System.out.println(varFloat1 + varFloat1);
//
//        double varDouble1 = Double.MAX_VALUE;
//        System.out.println(- varDouble1 - varDouble1);
//
//        char varChar1 = 'k';
//        if (varChar1 == 'u') {
//            System.out.println("Буква u");
//        } else {
//            System.out.println("Что-то другое");
//        }
//
//        System.out.println(varShort1 < varInt1);
//
//        int varInt2 = 100;
//        double varDouble2 = 10.1d;
//        System.out.println(varInt2 + varDouble2);
//        System.out.println(varInt2 - varDouble2);
//        System.out.println(varInt2 * varDouble2);
//        System.out.println(varInt2 / varDouble2);
    }
}