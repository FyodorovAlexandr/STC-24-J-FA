package com.fyodorov.lesson13;
import java.util.Scanner;

public class Mother {
    public String name;
    public int age;
    public static void main(String[] args) {
        MannerlyChild();
        Child child = new Child();
        child.name = "Иван";
        child.age = 5;
        Mother mother = new Mother();
        mother.name = "Мария";
        mother.age = 30;
        try {
            Child.Eat();
            System.out.println("Съел … за обе щеки");
        } catch (DonLikeFoodException e) {
            System.out.println("Ребенок выплюнул еду");
        } finally {
            System.out.println("Спасиба мама");
        }
    }

    public static void MannerlyChild() {
        System.out.println("Программа воспитанный ребенок !");
        System.out.println("Мама должна покормить ребенка.");
        System.out.println("Для просмотра вариантов еды нажмите +");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char b = a.charAt(0);
        if (b == '+') {
            Food[] types = Food.values();
            for (int i = 0; i < types.length; i++) {
                System.out.println(types[i]);
            }
        } else {
            System.out.println("Попробуйте еще раз");
            System.out.println("");
            MannerlyChild();
        }
    }
}


