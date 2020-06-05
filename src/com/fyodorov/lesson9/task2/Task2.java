package com.fyodorov.lesson9.task2;
/**
 * Класс {@code Task2} Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
 * Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
 * Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
 * @author Alexandr Fyodorov
 */

interface Fly{
    void fly();
}

interface Run{
    void run();
}

interface Swim{
    void swim();
}

class Duck implements Fly, Run, Swim{
    @Override
    public void fly() {
        System.out.println("Утки могут летать");
    }

    @Override
    public void run() {
        System.out.println("Утки могут бегать");
    }

    @Override
    public void swim() {
        System.out.println("Утки могут плавать");
    }
}

class Dog implements Run, Swim{
    @Override
    public void run() {
        System.out.println("Собаки могут бегать");
    }

    @Override
    public void swim() {
        System.out.println("Собаки могут плавать");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.run();
        duck.swim();

        Dog dog = new Dog();
        dog.run();
        dog.swim();
    }
}
