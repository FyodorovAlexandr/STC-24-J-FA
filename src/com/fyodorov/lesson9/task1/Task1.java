package com.fyodorov.lesson9.task1;

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
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");
        dog.display();
        cat.display();
    }
}