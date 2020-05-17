package com.fyodorov.lesson22;

import java.util.*;

public class PersonSuperComparator {
    public static void main(String[] args) {
        Comparator<Person> comparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet(comparator);
        people.add(new Person("Борис", 35));
        people.add(new Person("Виктор",20));
        people.add(new Person("Алексей",30));
        people.add(new Person("Алексей",25));
        System.out.println("Сортировка пользователей по имени и возрасту: ");

        for(Person  p : people){

            System.out.println(p.getName() + " " + p.getAge()+ " лет"); // сначала применяется сортировка по имени, а потом по возрасту.
        }
    }
}
