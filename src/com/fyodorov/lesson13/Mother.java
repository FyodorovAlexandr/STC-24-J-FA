package com.fyodorov.lesson13;

import static com.fyodorov.lesson13.Food.*;
/**
 * Класс {@code Mother} Программа должна имитировать поведение воспитанного ребенка, которого мама кормит вкусной или невкусной едой.
 * Если еда не нравится, ребенок ее не ест: выбрасывается исключительная ситуация, которая обрабатывается «мамой». Воспитанный ребенок,
 * даже если еда не естся, в любом случае скажет «спасибо» и поцелует маму.
 * @author Alexandr Fyodorov
 */
public class Mother {
    public static void main(String[] args) {
        Food[] food = {SOUP, PASTA, PORRIDGE, APPLE, CARROT, SWEETS};
        Child child = new Child();

        System.out.println("Имитация кормления ребенка едой");
        System.out.println();
        for (Food f : food) {
            try {
                child.tasteDish(f);
            } catch (ChildDissatisfiedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("Спасибо! Наелся на весь день.");
    }
}