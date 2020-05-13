package com.fyodorov.lesson21;

public class Task2 {
    public static void main(String[] args) {

        String str = "Hello world!";
        System.out.println(str);
        char[] reverseArray1 = str.toCharArray();
        System.out.print("1. Массив в обратном порядке: ");
        for (int i = reverseArray1.length - 1; i >= 0; i--)
            System.out.print(reverseArray1[i]);
        System.out.println();
        System.out.println();

            int[] reverseArray2 = {1, 2, 3, 4, 5};
            for (int i = 0; i < reverseArray2.length; i++)
                System.out.print(reverseArray2[i] + " ");

            System.out.print("\n2. Массив в обратном порядке: ");
            for (int i = reverseArray2.length - 1; i >= 0; i--) {
                System.out.print(reverseArray2[i] + " ");
            }
        }
    }


