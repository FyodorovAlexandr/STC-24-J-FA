package com.fyodorov.lesson3.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double seconds = 3600;

        System.out.println("Введите количество секунд для конвертации в часы:");
        Scanner in = new Scanner(System.in);
        seconds = in.nextInt();

        System.out.println("Конвертация в часы выполнена успешно:");
        double minutes = seconds / 60;
        double hours = minutes / 60;
        System.out.println(hours);
    }
}
