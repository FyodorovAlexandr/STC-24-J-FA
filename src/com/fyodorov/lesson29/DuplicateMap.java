package com.fyodorov.lesson29;

import java.io.*;
/**
 * Класс {@code DuplicateMap}
 * Реализовать метод removeTheDuplicates по поиску дубликатов в исходной мапе, затем при нахождении дубликата
 * удалить его из исходной мапы используя метод
 * @author Alexandr Fyodorov
 */
public class DuplicateMap {
    public static void main(String[] args) {

        PersonHashMap map = new PersonHashMap();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Введите № операции:");
                System.out.println("1 - создать элементы карты");
                System.out.println("2 - проверить значения карты на дубли");
                System.out.println("3 - вывести элементы карты");
                System.out.println("Для выхода: exit");

                String line = br.readLine();
                if (line.equals("exit")){
                    System.out.println("Всего доброго! ");
                    return;
                }

                switch (line) {
                    case "1":
                        map.fillMapWithElements();
                        break;
                    case "2":
                        map.deleteDuplicates();
                        break;
                    case "3":
                        map.showMap();
                        break;
                    default:
                        System.out.println("Введён некорректный номер операции");
                        System.out.println();
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}

