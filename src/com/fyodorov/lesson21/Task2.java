package com.fyodorov.lesson21;

public class Task2 {
    public static void main(String[] args) {

        String str = "Hello world!";
        System.out.println(str);
        char[] reverseArray1 = str.toCharArray();

        System.out.println();

        for (int i = 0; i < reverseArray1.length / 2; i++) {
            char tmp = reverseArray1[i];
            reverseArray1[i] = reverseArray1[reverseArray1.length - 1 - i];
            reverseArray1[reverseArray1.length - 1 - i] = tmp;

            System.out.print(i + " Текущее состояние массива: ");
            for (int j = 0; j < reverseArray1.length; j++)
                System.out.print(reverseArray1[j]);
            System.out.println();

        }

        System.out.print("Массив в обратном порядке: ");
        for (int j = 0; j < reverseArray1.length; j++)
            System.out.print(reverseArray1[j]);
        System.out.println();

    }
}