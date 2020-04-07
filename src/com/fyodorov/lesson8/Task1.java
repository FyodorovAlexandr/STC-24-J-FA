package com.fyodorov.lesson8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        final int b, c, result;
        System.out.println("Для того, чтобы получить сумму чисел");
        System.out.print("Введите первое число: ");
        b = a.nextInt();
        System.out.print("Введите второе число: ");
        c = a.nextInt();
        result = b + c;
        System.out.println("Результат: " + result);
    }
}
