package com.fyodorov.lesson11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Класс {@code Censor} Напишите программу которая получает на вход некую строку, после она вызывает метод,
 * заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой» и выводит результат в консоль!
 * @author Alexandr Fyodorov
 */
public class Censor {
    public static void main(String[] args) {
        censorPattern();
    }

    public static void censorPattern(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        String text = in.nextLine();
        Pattern censor = Pattern.compile("бяка(\\w*)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher replaceCensor = censor.matcher(text);
        String newText = replaceCensor.replaceAll("вырезано цензурой ");
        System.out.println(newText);
    }
}
