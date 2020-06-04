package com.fyodorov.lesson4.task4;
/**
 * Класс {@code Task4} Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
 * @author Alexandr Fyodorov
 */
public class Task4 {
    public static void main(String[] args) {
        for (int i = 1, a = 0; i < 6; i++) {
            a += i;
            System.out.println(a);
        }
    }
}
