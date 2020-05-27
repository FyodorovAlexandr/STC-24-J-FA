package com.fyodorov.lesson27;

/**
 * Класс {@code Task2} реализация ряда Фибоначчи через рекурсию.
 * @author Alexandr Fyodorov
 */

public class Task2 {
        private static int f ( int index){
            if (index < 1) {
                return 0;
            } else if (index == 1) {
                return 1;
            } else {
                return f(index - 1) + f(index - 2);
            }
        }

        public static void main (String[]args){
            for (int i = 0; i <= 10; i++) {
                System.out.print(f(i) + " ");
            }
        }
    }


