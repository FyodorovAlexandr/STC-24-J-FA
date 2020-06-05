package com.fyodorov.lesson9.task3;
/**
 * Класс {@code Task3} Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать»(в каждом сделать 1-2 метода).
 * Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.
 * @author Alexandr Fyodorov
 */
interface Run{
    void fast();
    void slow();
}

interface Swim{
    void fast();
    void slow();
}

    abstract class Person {

    static class Man extends Person implements Run {
        @Override
        public void fast() {
            System.out.println("Мужчина может бегать быстро");
        }

        @Override
        public void slow() {
            System.out.println("Мужчина может бегать медленно");
        }
    }

    static class Woman extends Person implements Swim {
        @Override
        public void fast() {
            System.out.println("Женщина может плавать быстро");
        }

        @Override
        public void slow() {
            System.out.println("Женщина может плавать медленно");
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Person.Man man = new Person.Man();
        man.fast();
        man.slow();
        Person.Woman woman = new Person.Woman();
        woman.fast();
        woman.slow();
    }
}
