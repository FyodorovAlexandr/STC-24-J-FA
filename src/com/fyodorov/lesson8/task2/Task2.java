package com.fyodorov.lesson8.task2;

import java.util.Scanner;
/**
 * Класс {@code Task2} Реализовать класс Calculator, который будет содержать статические методы для операций вычитания,
 * сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами, так и с дробями.
 * @author Alexandr Fyodorov
 */
public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = calculator(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static double getDouble(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calculator(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '%':
                result = num1%num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculator(num1, num2, getOperation());
        }
        return result;
    }
}
