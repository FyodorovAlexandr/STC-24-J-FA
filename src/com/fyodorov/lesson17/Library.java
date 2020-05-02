package com.fyodorov.lesson17;

import java.io.*;
import java.util.ArrayList;

public class Library {
        public static void addBooks(ArrayList<Book>bookArrayList){
            File file = new File("bookList.txt");
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
                for(Book s: bookArrayList){
                    bufferedWriter.write(s+"\n");
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        
        public static void showListOfBooks(){

            try{
                File file = new File("bookList.txt");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine())!=null){
                    System.out.println(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            //System.out.println(e);
            e.printStackTrace();
            e.getStackTrace();
        }
    }
}





