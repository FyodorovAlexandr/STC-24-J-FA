package com.fyodorov.lesson15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class WorkWithFiles {
    public static void main(String[] args) {

//      Создание файла notes.txt:
        File d1 = new File("C:\\My Folder\\");
        File myFile = new File("C:\\My Folder\\notes.txt");
        System.out.println(myFile.getName());
        System.out.println(myFile.getParent());

        try {
            boolean created = myFile.createNewFile();
            if (created)
                System.out.println("File has been created");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        if (myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println(myFile.length());

        if (myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if (myFile.canWrite())
            System.out.println("File can be write");
        else
            System.out.println("File can not be write");

        if (myFile.isHidden())
            System.out.println("File can be hidden");
        else
            System.out.println("File can not be hidden");

//      Переименование файла из notes.txt в document.txt:
        File newFile = new File("C:\\My Folder\\document.txt");
        myFile.renameTo(newFile);

//      Копирование существующего файла book:
        Path copyFile = Paths.get("C:\\My Folder\\book2.txt");
        try {
            File textFile = new File("C:\\My Folder\\book.txt");
            Path originalPath = textFile.toPath();
            Files.copy(originalPath, copyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//      Удаление папки:
        boolean deleted = newFile.delete();
        System.out.println(deleted);
    }
}
