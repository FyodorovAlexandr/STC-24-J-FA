package com.fyodorov.lesson21.task2;

import java.util.Scanner;

/**
 * Класс {@code ReverseArray} Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
 * Задачу не зачитывать если использованы утильные методы класса Arrays.
 * Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.
 * Вывести массив в консоль до и после вызова метода по реверсу массива
 * @author Alexandr Fyodorov
 */

public class ReverseArray {
    public static void main(String[] args) {

        System.out.println("Введите элементы массива: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
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
