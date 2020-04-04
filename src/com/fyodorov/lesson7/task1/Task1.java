package com.fyodorov.lesson7.task1;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner;

    public static void main(String[] args) {
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
            Drink[] types = Drink.values();
            for (int i = 0; i < types.length; i++) {
                System.out.println(types[i]);
            }
        } else {
            System.out.println("Вы допустили ошибку. Попробуйте еще раз.");
            System.out.println("");
            Start();
        }
    }

    public static int Money() {

        System.out.println("");
        System.out.println("Вставьте деньги в автомат: ");
        System.out.println("50 руб");
        System.out.println("60 руб");
        System.out.println("70 руб");
        int money = scanner.nextInt();

        if (money < 50) {
            System.out.println("Баланс: " + money + " рублей");
            System.out.println("Недостаточно средств для покупки");
            System.out.println("Введите дополнительно от " + (money - 50) + " до " + (money - 70) + " рублей ");
            money = money + scanner.nextInt();
            System.out.println("Баланс: " + money);
        } else {
            System.out.println("Баланс: " + money);
        }
        return money;
    }

    public static void Menu() {
        System.out.println("Выберите номер напитка: ");
        System.out.println("1 - PEPSI");
        System.out.println("2 - COLA");
        System.out.println("3 - SPRITE");

        int i = scanner.nextInt();
        Drink chy = null;

        switch (i) {
            case 1:
                chy = Drink.PEPSI;
                System.out.println("Вы выбрали PEPSI");
                System.out.println("Спасибо за покупку");
                break;
            case 2:
                chy = Drink.COLA;
                System.out.println("Вы выбрали COLA");
                System.out.println("Спасибо за покупку");
                break;
            case 3:
                chy = Drink.SPRITE;
                System.out.println("Вы выбрали SPRITE");
                System.out.println("Спасибо за покупку");
                break;
            default:
                System.out.println("Такого номера не существует");
                System.out.println("Попробуйте еще раз");
                System.out.println("");
                Menu();
        }
    }
}



