package com.fyodorov.lesson19;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {

        String productName;
        double price;
        double quantity;
        double cost;
        double totalCost = 0;
        File file = new File("products.txt");

        try {
            Scanner scanner = new Scanner(file);
            Formatter f = new Formatter();
            System.out.println(f.format("%-16s%11s%15s%18s", "Наименование", "Цена", "Количество", "Стоимость"));
            System.out.println("=============================================================");

            while (scanner.hasNextLine()) {
                productName = scanner.nextLine();
                price = Double.parseDouble(scanner.nextLine());
                quantity = Double.parseDouble(scanner.nextLine());
                cost = quantity * price;
                totalCost += cost;
                f = new Formatter();
                f.format("%-16s %3$11.2f %13.2f %4$18.2f", productName, quantity, price, cost);
                System.out.println(f);
            }
            f.close();
            System.out.println("=============================================================");
            System.out.printf("Итого %55.2f", totalCost);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
