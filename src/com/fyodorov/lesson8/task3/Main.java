package com.fyodorov.lesson8.task3;
/**
 * Класс {@code Main} Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
 * Написать метод для получения информации о количестве.
 * @author Alexandr Fyodorov
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
             new ObjectCounter();
        }
        System.out.println("Создано объектов ObjectCounter: " + ObjectCounter.getObjectCount());
    }
}
