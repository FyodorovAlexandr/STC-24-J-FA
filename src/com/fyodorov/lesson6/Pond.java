package com.fyodorov.lesson6;
/**
 * Класс {@code Pond} Смоделировать предметную область
 * Класс имитирует пруд, заселённый животными
 * @author Alexandr Fyodorov
 */
public class Pond {
    public static void main(String[] args) {

        Animal frog = new Frog("Озерная лягушка", "зелёный");
        System.out.println("В пруду водится лягушка: " + frog.getName());
        frog.voice();
        System.out.println("Цвет кожи: " + frog.getColor());
        System.out.println();

        Animal duck = new Duck("Пятнистая утка", "серый");
        System.out.println("В пруду водится утка: " + duck.getName());
        duck.voice();
        System.out.println("Цвет перьев: " + duck.getColor());
        System.out.println();

        Animal fish = new Fish("Карась", "серебристый");
        System.out.println("В пруду водится рыба: " + fish.getName());
        fish.voice();
        System.out.println("Цвет чешуи: " + fish.getColor());
    }
}
