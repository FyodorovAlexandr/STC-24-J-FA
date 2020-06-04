package com.fyodorov.lesson4.task3;
/**
 * Класс {@code Task3} Написать программу для вывода на экран таблицы умножения.
 * @author Alexandr Fyodorov
 */
public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}



