package com.fyodorov.lesson7;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Task1 {
    public static final Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static Scanner scanner;

    public static void main(String[] args) {
        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("MyFile.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logr.addHandler(fileHandler);
        } catch (IOException e) {
            System.err.println("File logger is not working" + e);
        }

        scanner = new Scanner(System.in);
        Vending();
    }

    public static void Vending() {
        Start();
        Money();
        Menu();
    }

    public static void Start() {
        System.out.println("Автомат напитков");
        System.out.println("Чтобы посмотреть меню нажмите +");
        String b = scanner.nextLine();
        char h = b.charAt(0);
        if (h == '+') {
            logr.log(Level.INFO, "Пользователь ввел: " + h);
            Drink[] types = Drink.values();
            for (int i = 0; i < types.length; i++) {
                System.out.println("№" + (i + 1) + " " + types[i] + " " + types[i].getPrice() + " руб");
            }
        } else {
            logr.log(Level.SEVERE, "Пользователь вместо + ввел: " + h);
            System.out.println("Вы допустили ошибку. Попробуйте еще раз.");
            System.out.println("");
            Start();
        }
    }

    public static void Money() {

        System.out.println("Вставьте деньги в автомат: ");
        int money = scanner.nextInt();

        if (money < 50) {
            logr.log(Level.WARNING, "Пользователь ввел: " + money + " руб." + " Недостаточно для покупки");
            System.out.println("Баланс: " + money + " рублей");
            System.out.println("Недостаточно средств для покупки");
            money = money + scanner.nextInt();
            logr.log(Level.INFO, "Пользователь ввел дополнительно. Баланс: " + money+ " руб");
            System.out.println("Баланс: " + money);

        } else {
            logr.log(Level.INFO, "Пользователь ввел: " + money+ " руб");
            System.out.println("Баланс: " + money);
        }
    }

    public static void Menu() {
        System.out.println("Выберите номер напитка: ");

        int i = scanner.nextInt();
        if (i == 1){
            logr.log(Level.INFO, "Пользователь выбрал: "+ Drink.PEPSI);
            System.out.println("Возьмите заказ: "+ Drink.PEPSI);
        }
        else if(i == 2){
            logr.log(Level.INFO, "Пользователь выбрал: "+ Drink.COLA);
            System.out.println("Возьмите заказ: "+ Drink.COLA);
        }
        else if (i == 3){
            logr.log(Level.INFO, "Пользователь выбрал: "+ Drink.SPRITE);
            System.out.println("Возьмите заказ: "+ Drink.SPRITE);
        }
        else {
            logr.log(Level.SEVERE, "Пользователь выбрал несуществующий номер: "+ i);
            System.out.println("Номер не существует");
            Menu();
        }
    }
}



