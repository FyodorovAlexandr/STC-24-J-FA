package com.fyodorov.lesson30;

import java.util.*;
/**
 * Класс {@code Task1}
 * Напишите программу для поиска первого неповторяющегося символа в строке.
 * Например, первый неповторяющийся символ в «total» равен «o», а первый неповторяющийся символ в «teter» равен «r».
 * @author Alexandr Fyodorov
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для поиска первого неповторяющегося символа: ");
        String str = scanner.nextLine();

        Character character = findFirstNonRepeatingChar(str);
        System.out.println("Первый неповторяющийся элемент: "+character);
    }

// Метод ищет первый неповторяющийся элемент в строке
    public static Character findFirstNonRepeatingChar(String s) {

        Map<Character, Integer>map = new HashMap<>();
        int i;
        Character character;
        int length = s.length();

// Добавление элменетов в HashMap
        for(i = 0; i < length; i++){
            character = s.charAt(i);
            if(map.containsKey(character)){
                map.put(character, map.get(character)+1);
            }else
                map.put(character, 1);
        }

// Проверка неповторяющихся элементов в строке
        for (i = 0; i < length; i++){
            character = s.charAt(i);
            if(map.get(character)==1){
                return character;
            }
        }
        return null;
    }
}