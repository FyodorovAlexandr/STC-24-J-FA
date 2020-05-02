package com.fyodorov.lesson17;

import java.util.ArrayList;

public class BookList {
    public static void main(String[] args) {

        ArrayList<Book> bookArrayList = new ArrayList<>();

        bookArrayList.add(new Book("Бойцовский клуб", "Чак Паланик", "1996"));
        bookArrayList.add(new Book("Java 8. Руководство для начинающих", "Герберт Шилдт", "2002"));
        bookArrayList.add(new Book("Изучаем Java", "Кати Сьерра, Берт Бейтс", "2003"));

        Library.addBooks(bookArrayList);
        Library.showListOfBooks();
    }
}
