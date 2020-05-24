package com.fyodorov.lesson25.task1;

import java.io.*;
import java.util.logging.*;

public class Main {

    public static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        LogManager.getLogManager().reset();
        log.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("Lesson25.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            log.addHandler(fileHandler);

        }catch (IOException e){
            System.err.println("Логирование не работает" +e);
        }

        MyBasket basketHashMap = new MyBasket();
        System.out.println("Add product: ");
        basketHashMap.addProduct("Рубашка", 2);
        log.log(Level.INFO, "В корзину добавлена рубашка, в количестве - 2 шт.");
        basketHashMap.addProduct("Брюки", 3);
        log.log(Level.INFO,"В корзину добавлены брюки, в количветсве - 3 шт.");
        basketHashMap.addProduct("Ботинки", 2);
        log.log(Level.INFO, "В корзину добавлены ботинки, в количестве - 2 шт.");
        basketHashMap.addProduct("Пиджак", 1);
        log.log(Level.INFO, "В корзину добавлен пиджак, в количестве - 1 шт.");
        basketHashMap.getProducts();

        System.out.println("Update product quantity: ");
        basketHashMap.updateProductQuantity("Брюки", 1);
        log.log(Level.INFO, "В корзине обновили количество рубашек до 1");
        basketHashMap.getProducts();

        System.out.println("Remove product: ");
        basketHashMap.removeProduct("Рубашка");
        log.log(Level.INFO, "Из корзины удалили Рубашки");
        basketHashMap.getProducts();

        basketHashMap.clear();
        log.log(Level.INFO, "Очистили корзину");
        basketHashMap.getProducts();

        basketHashMap.getProductQuantity("Брюки");
        log.log(Level.INFO, "Корзина пуста");
        basketHashMap.getProducts();
    }
}
