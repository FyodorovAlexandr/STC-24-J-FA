package com.fyodorov.lesson17;

import java.io.*;
import java.util.Arrays;

public class Library implements Serializable {

    private static final long serialVersionUID = 1L;
    private Book[] books;

    public Library() {
        books = new Book[1];
    }

    public void showBooks() {
        if (books.length == 1 && books[0] == null) {
            System.out.println("Библиотека пуста. Пожалуйста добавьте книгу или попробуйте восстановить библиотеку");
            System.out.println();
        } else {
            System.out.println("Список книг:");
            System.out.println();
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void addBook(Book book) {
        if (books.length == 1 && books[0] == null) {
            books[0] = book;
        } else {
            books = Arrays.copyOf(books, books.length + 1);
            books[books.length - 1] = book;
        }
        System.out.println("Книга добавлена в библиотеку: "+book);
        System.out.println();
    }
}





