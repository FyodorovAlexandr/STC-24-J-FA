package com.fyodorov.lesson8;

import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getInt();
        double num2 = getInt();
        char operation = getOperation();
        double result = calculator(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static double getInt(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
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
