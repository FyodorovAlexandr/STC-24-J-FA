package com.fyodorov.lesson13;

import java.util.Scanner;

public class Child {
    public String name;
    public int age;

    public static void Eat() throws DonLikeFoodException {
        System.out.println("Введите номер еды из списка");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int s = scanner.nextInt();
            if (s==2) {
                System.out.println("Съел … за обе щеки \n" + "Спасибо, мама");
            }
            else if (s==1 || s==3){
                throw new DonLikeFoodException();
            }
            else {
                System.out.println("Попробуй еще раз");
                Eat();
            }
        }
    }
}

