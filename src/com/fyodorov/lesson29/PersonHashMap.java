package com.fyodorov.lesson29;

import java.util.*;

public class PersonHashMap {
    private Map<String, Person> personMap;

    public PersonHashMap() {
        personMap = new HashMap<>();
    }

    public void fillMapWithElements() {
        personMap = createMap();
        System.out.println("Карта заполнена.");
        System.out.println();
    }

    public static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void removeTheDuplicates(Map<String, Person> map) {
        HashMap<String, Person> entryMap = new HashMap<>(map);
        HashMap<String, Person> controlMap = new HashMap<>(map);

        for (Map.Entry<String, Person> entry : entryMap.entrySet()) {
            controlMap.remove(entry.getKey());
            if (controlMap.containsValue(entry.getValue())) {
                removeItemFromMapByValue(map, entry.getValue());
                removeItemFromMapByValue(controlMap, entry.getValue());
            }
        }
    }

    public void deleteDuplicates() {
        if (personMap.isEmpty()) {
            System.out.println("Карта пуста. Создайте элементы карты.");
            System.out.println();
        } else {
            removeTheDuplicates(personMap);
            System.out.println("Значения карты проверены на дублирование.\nВыведите элементы карты");
            System.out.println();
        }
    }

    public void showMap() {
        if (personMap.isEmpty()) {
            System.out.println("Карта пуста. Создайте элементы карты.");
            System.out.println();
        } else {
            System.out.println(personMap);
            System.out.println();
        }
    }
}
