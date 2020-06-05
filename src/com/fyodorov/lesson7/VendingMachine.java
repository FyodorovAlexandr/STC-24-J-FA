package com.fyodorov.lesson7;

import java.util.logging.Level;
import java.util.logging.Logger;
import static com.fyodorov.lesson7.Drinks.*;

public class VendingMachine {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private double money = 0;
    private final Drinks[] drinks;

    public VendingMachine() {
        drinks = new Drinks[] {JUICE, TEA, COFFEE, WATER};
    }

    public void showContent() {
        for (int i = 0; i < drinks.length; i++) {
            System.out.println("Товар № "+i+" "+drinks[i]);
        }
    }

    public double getCountOfMoney() {
        return money;
    }

    public void addMoney(double money) {
        if (money > 0)
            this.money += money;
    }

    public boolean checkIfCorrectProductIndex(int productIndex) {
        if (productIndex >= 0 && productIndex <= drinks.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfMoneyEnoughToBuyProduct(int productIndex) {
        if (money < Drinks.getDrinkPrice(drinks[productIndex])) {
            System.out.println("Внесено недостаточно денег. Баланс: "+money+ " руб.");
            logger.log(Level.WARNING, "Внесено недостаточно денег. Баланс: "+money+ " руб.");
            return false;
        } else {
            return true;
        }
    }

    public void getProduct(int productIndex) {
        money -= Drinks.getDrinkPrice(drinks[productIndex]);
        System.out.println("Куплен товар № "+productIndex+" "+drinks[productIndex]);
        logger.log(Level.INFO, "Куплен товар № "+productIndex+" "+drinks[productIndex]);
    }
}
