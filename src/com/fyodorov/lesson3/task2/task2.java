package com.fyodorov.lesson3.task2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        double salaryAmount = 70000;

        System.out.println("Введите величину зарплаты до вычета НДФЛ:");
        Scanner in = new Scanner(System.in);
        salaryAmount = in.nextInt();

        System.out.println("Зарплата после вычета НДФЛ: ");
        double tax = salaryAmount * 13 / 100;
        double handSalary = salaryAmount - tax;
        System.out.println(handSalary);
    }
}

