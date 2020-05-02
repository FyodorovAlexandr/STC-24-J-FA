package com.fyodorov.lesson17;

public class Book {

    private String bookName;
    private String bookAuthor;
    private String bookYearOfPublishing;

    Book(String bookName, String bookAuthor, String bookYearOfPublishing){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYearOfPublishing = bookYearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Название книги='" + bookName + '\'' +
                ", Автор='" + bookAuthor + '\'' +
                ", Год издания=" + bookYearOfPublishing +
                '}';
    }
}
