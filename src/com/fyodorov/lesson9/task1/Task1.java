package com.fyodorov.lesson9.task1;
/**
 * Класс {@code Task1} Написать абстрактный класс Animal с абстрактным методом getName.
 * Сделать несколько классов животных, наследников Animal. Метод getName должен выводит название каждого животного.
 * @author Alexandr Fyodorov
 */
abstract class Animal {
    private String name;
    public String getName() {
        return name;
    }

    public Animal(String name){
        this.name = name;
    }

    public abstract void display();
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void display(){
        System.out.printf("Animal: %s \n", super.getName());
    }
}

class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public void display(){
        System.out.printf("Animal: %s \n", super.getName());
    }
}

public class Task1 {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        Animal cat = new Cat("Cat");
        dog.display();
        cat.display();
    }
}