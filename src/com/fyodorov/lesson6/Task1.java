package com.fyodorov.lesson6;

class Animal {
    public void drinks() {
        System.out.println("An animal is drinks");
    }
}
class Cat extends Animal {

    Cat(String name)
    {
        this.name = name;
    }
    int age = 0;
    String name;
    public void voice() {

        for (int i = 1; i <= this.age; i++)
            System.out.println("Мяу");
        }

        public void drinks() {
            System.out.println("cat drinks");
        }
        public void this_drinks() {
        System.out.println("Call cat.drinks()");
        this.drinks();
        }
        public void super_drinks() {
        System.out.println("Call Animal.drinks()");
        super.drinks();
        }
    }

    public class Task1 {
        public static void main(String[] args) {
            Cat x;
            x = new Cat("Мурка");
            x.age = 3;
            x.voice();

            x.drinks();
            x.this_drinks();
            x.super_drinks();
        }
    }




