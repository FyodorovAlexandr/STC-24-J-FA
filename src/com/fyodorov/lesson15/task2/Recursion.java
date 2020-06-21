package com.fyodorov.lesson15.task2;

import java.io.*;

/**
 * Класс выводит дерево файлов и подкаталогов для указанной папки
 * @author Alexandr Fyodorov
 */
public class Recursion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath;
        FolderTree ft = new FolderTree();

        while (true) {
            System.out.println("Введите путь к папке, чтобы вывести её дерево файлов и подкаталогов");
            System.out.println("Выход: exit");
            filePath = br.readLine();
            if (filePath.equals("exit")) break;

            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("Папка " + filePath + " не сществует");
                continue;
            }
            if (!file.isDirectory()) {
                System.out.println("Нужно указать путь к папке");
                continue;
            }

            ft.getFolderTree(filePath,0);
            System.out.println();
        }
    }
}
