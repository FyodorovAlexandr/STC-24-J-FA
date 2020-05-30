package com.fyodorov.lesson25.task2;

import java.util.*;

public class IsUnique{
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Иванов");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Петров");

        for(Map.Entry<String,String>entry: map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!set.add(entry.getValue())) {
                System.out.println();
                System.out.println("Обнаружены одинаковые значения: ");
                return false;
            }
            }
            System.out.println();
            System.out.println("Одинаковых значений не обнаружено: ");
            return true;
        }
    }

