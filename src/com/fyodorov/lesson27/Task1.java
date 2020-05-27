package com.fyodorov.lesson27;

/**
 * Класс {@code Task1} реализация ряда Фибоначчи через итерацию.
 * @author Alexandr Fyodorov
 */

public class Task1 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int fib, i = 0;
        while (i < 9) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
    }
}

