package com.fyodorov.lesson24;

import java.util.*;
/**
 * Класс {@code RemoveEvenLength} Написать метод, который возвращает множество,
 * в котором удалены все элементы четной длины из исходного множества.
 * public Set<String> removeEvenLength(Set<String> set);
 * Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]
 * @author Alexandr Fyodorov
 */
    public class RemoveEvenLength {
        public static void main(String[] args) {

            Set<String> linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.add("foo");
            linkedHashSet.add("buzz");
            linkedHashSet.add("bar");
            linkedHashSet.add("fork");
            linkedHashSet.add("bort");
            linkedHashSet.add("spoon");
            linkedHashSet.add("!");
            linkedHashSet.add("dude");
            System.out.println(removeEvenLength(linkedHashSet));
        }

        public static Set<String> removeEvenLength(Set<String>set){
            if (!set.isEmpty()) {
                set.removeIf(s -> (s.length() % 2) == 0);
            }
            return set;
        }
    }
