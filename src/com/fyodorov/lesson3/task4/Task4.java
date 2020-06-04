package com.fyodorov.lesson3.task4;

import java.util.Random;
import java.util.Scanner;
/**
 * Класс {@code Task4} Создать консольное Java-приложение «Горячо-Холодно»
 * @author Alexandr Fyodorov
 */
public class Task4 {
    public static int a, d, c;
        static Scanner scanner;

        public static void main(String[] args) {
            scanner = new Scanner(System.in);
            Starter();
    }
    static void Starter(){
        Start();
        Generator();
        Logic();
    }
    static void Generator(){
        Random random = new Random();
        a = random.nextInt(100);
    }
    static void Start(){
        System.out.println("Готовы сыграть в игру «горячо-холодно»?");
        System.out.println("Если готовы нажмите +");
        String b = scanner.nextLine();
        char h = b.charAt(0);
        if (h == '+') {
            System.out.println("Угадайте число от 0 до 100");
            d = scanner.nextInt();
        } else {
            System.out.println("Жаль, до встречи");
        }
    }
    static void Logic() {
        while (d != a) {
            c = Math.abs(a - d);
            Var(c);
            d = scanner.nextInt();
        }
        System.out.println("Поздравляю вы угадали!!!");
    }
    public static void Var(int s){
        switch (s) {
            case 1:
                System.out.println("Очень горячо");
                break;
            case 2:
                System.out.println("Горячо");
                break;
            case 3:
                System.out.println("Тепло");
                break;
            case 4:
                System.out.println("Холодно");
                break;
            default:
                System.out.println("Очень холодно");
                break;
        }
    }
}
