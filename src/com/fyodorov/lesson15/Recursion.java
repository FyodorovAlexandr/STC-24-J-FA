package com.fyodorov.lesson15;

import java.io.*;

public class Recursion {

//  Рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
    public static void main(String[] args) {

        File dir = new File("C:\\My Folder");
        recursionDirectory(dir);
    }

    public static void recursionDirectory(File folder){

        File[] folderEntries = folder.listFiles();
        for(File entry : folderEntries){
            if(entry.isDirectory()){
                System.out.println(entry.getName() + "\t Folder");
                recursionDirectory(entry);
            }
            else System.out.println(entry.getName() + "\t File");
        }
    }
}

