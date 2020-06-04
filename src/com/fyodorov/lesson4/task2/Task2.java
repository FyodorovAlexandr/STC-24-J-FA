package com.fyodorov.lesson4.task2;

import java.util.Scanner;
/**
 * Класс {@code Task2} Написать программу, которая описывает введенное число.
 * Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
 * @author Alexandr Fyodorov
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a < 0 && (a % 2 == 0)) {
            System.out.println("Отрицательное четное число");

        } else if (a < 0 && (a % 2 != 0)) {
            System.out.println("Отрицательное нечетное число");

        } else if (a > 0 && (a % 2 == 0)) {
            System.out.println("Положительное четное число");

        } else if (a > 0 && (a % 2 != 0)) {
            System.out.println("Положительное нечетное число");

        } else if (a == 0) {
            System.out.println("Нуль");
        }
    }
}
