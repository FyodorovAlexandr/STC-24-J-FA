package com.fyodorov.lesson7;

import java.io.*;
import java.util.logging.*;
/**
 * Класс {@code DrinkBox} Программа имитирует автомат по продаже напитков
 * @author Alexandr Fyodorov
 */
public class DrinkBox {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws IOException {
        LogManager.getLogManager().reset();
        logger.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("Lesson7.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.err.println("File logger is not working" + e);
        }

        VendingMachine vm = new VendingMachine();
        System.out.println("--------------------------------------------------");
        vm.showContent();
        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isNotBought = true;
        boolean isNeedToAddMoney = true;
        boolean isCanToChooseDrink = false;
        double cash;
        int productIndex;

        while (isNotBought) {
            if (isNeedToAddMoney) {
                System.out.println("Добавьте деньги для покупки:");
                cash = Double.parseDouble(reader.readLine());
                logger.log(Level.INFO, "Покупатель ввел в автомат: " + cash+ " руб");
                vm.addMoney(cash);
                if (vm.getCountOfMoney() > 0) {
                    System.out.println("В автомате: "+vm.getCountOfMoney()+" руб.");
                    logger.log(Level.INFO, "В автомате: " + vm.getCountOfMoney()+ " руб");
                    isNeedToAddMoney = false;
                    isCanToChooseDrink = true;
                } else {
                    System.out.println("Денег в автомате недостаточно: "+vm.getCountOfMoney()+" руб.");
                    logger.log(Level.WARNING, "Денег в автомате недостаточно: " + vm.getCountOfMoney()+ " руб");
                    isNeedToAddMoney = true;
                    isCanToChooseDrink = false;
                }
            }

            if (isCanToChooseDrink) {
                System.out.println("Выберите номер напитка для покупки:");
                productIndex = Integer.parseInt(reader.readLine());
                if (vm.checkIfCorrectProductIndex(productIndex)) {
                    if (vm.checkIfMoneyEnoughToBuyProduct(productIndex)) {
                        logger.log(Level.INFO, "Покупатель выбрал номер напитка: " + productIndex);
                        vm.getProduct(productIndex);
                        if (vm.getCountOfMoney() > 0) {
                            System.out.println("Ваша сдача: "+vm.getCountOfMoney()+" руб.");
                            logger.log(Level.INFO, "Сдача: " + vm.getCountOfMoney());
                        }
                        isNotBought = false;
                    } else {
                        isNeedToAddMoney = true;
                        isCanToChooseDrink = false;
                    }
                } else {
                    System.out.println("Введён некорректный номер напитка!");
                    logger.log(Level.WARNING, "Введён некорректный номер напитка! ");
                    System.out.println();
                    vm.showContent();
                }
            }
        }
        System.out.println("Спасибо за покупку!");
        logger.log(Level.INFO, " Покупатель забрал напиток ");
    }
}
