package com.fyodorov.lesson31;

import java.util.Scanner;
/**
 * Класс {@code Task1} Проверяет строку на палиндром
 * @author Alexandr Fyodorov
 */
public class Palindrome{
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        isPalindrome(str);
    }

    public static String reversString(String s){
        String r = "";
        for(int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    public static Boolean isPalindrome(String s){
        if(s.equals(reversString(s))){
            System.out.println("Палиндром");
        }else {
            System.out.println("Не палиндром");
        }
        return s.equals(reversString(s));
    }
}
