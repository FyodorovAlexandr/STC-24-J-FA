package com.fyodorov.lesson3.task1;

import java.util.Scanner;
/**
 * Класс {@code Task1} Программа, которая считает стоимость бензина
 * (на вход программе передается кол-во литров, на выходе печатается стоимость)
 * @author Alexandr Fyodorov
 */
public class Task1 {
    public static void main(String[] args) {
        double literCost = 43;
        int numberOfLiters = 50;

        System.out.println("Введите стоимость литра:");
        Scanner in = new Scanner(System.in);
        literCost = in.nextInt();

        System.out.println("Введите количество литров:");
        numberOfLiters = in.nextInt();
        double theCostOfGasoline = literCost*numberOfLiters;

        System.out.println("Стоимость бензина:");
        System.out.println(theCostOfGasoline);
    }
}

