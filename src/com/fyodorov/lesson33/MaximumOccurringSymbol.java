package com.fyodorov.lesson33;

import java.util.*;
/**
 * Класс {@code MaximumOccurringSymbol} Вывести максимально встречающийся символ в строке.
 * Пример:
 * This is test message
 * Character: s has occurred maximum times in String: 5
 * @author Alexandr Fyodorov
 */
public class MaximumOccurringSymbol {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        Map<Character, Integer> occurrences = new HashMap<>();

        for (char c : string.toCharArray()) {
            if (!occurrences.containsKey(c)) {
                occurrences.put(c, 1);
            } else
                occurrences.put(c, occurrences.get(c) + 1);
        }

        int maxValueInMap = (Collections.max(occurrences.values()));
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            int count = 0;
            count += entry.getValue();
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Character: " + entry.getKey() + " has occurred maximum times in String: " + count);
            }
        }
    }
}