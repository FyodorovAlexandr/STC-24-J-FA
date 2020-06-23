package com.fyodorov.lesson25.task2;

import java.util.*;
/**
 * Класс {@code IsUnique}
 * public boolean isUnique(Map<String, String> map);
 * Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.
 * Для пустой мапы метод возвращает true.
 * Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
 * а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.
 * @author Alexandr Fyodorov
 */
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

