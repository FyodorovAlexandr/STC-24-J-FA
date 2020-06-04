package com.fyodorov.lesson3.task2;

import java.util.Scanner;
/**
 * Класс {@code Task2} Программа, которая считает зарплату «на руки»
 * (на вход программе передается величина зарплаты, на выходе печатается зарплата за вычетом 13% (НДФЛ)
 * @author Alexandr Fyodorov
 */
public class Task2 {

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

