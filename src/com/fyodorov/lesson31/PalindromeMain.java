package com.fyodorov.lesson31;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Класс {@code PalindromeMain} предоставляет возможность проверить строку на палиндром двумя способами.
 * Суть задачи:
 * Палиндром - это слово, фраза, число или другая последовательность символов или элементов, которая читает то же самое вперед или назад.
 * Например: 12121 - палиндром, так как он читает то же самое вперед или назад. мадам тоже палиндром.
 * Требуется написать 2 реализации проверки строки на палиндром:
 * - Перемещение с обоих концов строки одновременно
 * - Используя стандартные функции строки
 * @author Alexandr Fyodorov
 */
public class PalindromeMain {

    /**
     * Точка входа.
     * @param args содержит аргументы командной строки.
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Введите строку для проверки на палиндром (exit для выхода):");
                String line = br.readLine();
                if (line.equals("exit")) return;

                String str = line;

                System.out.println("Введите № операции (exit для выхода):");
                System.out.println("1 - первый способ");
                System.out.println("2 - второй способ");
                line = br.readLine();
                if (line.equals("exit")) return;

                switch (line) {
                    case "1":
                        if (Palindrome.firstWay(str)) {
                            System.out.println("Строка " +str+ " - палиндром");
                        } else {
                            System.out.println("Строка " +str+ " - не палиндром");
                        }
                        break;
                    case "2":
                        if (Palindrome.secondWay(str)) {
                            System.out.println("Строка " +str+ " - палиндром");
                        } else {
                            System.out.println("Строка " +str+ " - не палиндром");
                        }
                        break;
                    default:
                        System.out.println("Введён некорректный номер операции");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}