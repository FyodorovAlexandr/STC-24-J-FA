package com.fyodorov.lesson24;

import java.util.*;

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
