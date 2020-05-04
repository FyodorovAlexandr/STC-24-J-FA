package com.fyodorov.lesson18;

import java.io.*;
import java.util.logging.*;

public class Task1 {
    public static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        LogManager.getLogManager().reset();
        log.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("Lesson18.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            log.addHandler(fileHandler);
        } catch (IOException e) {
            System.err.println("File logger is not working" + e);
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader("My Folder1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("My Folder2.txt"));
            String a;
            byte[] b;
            while ((a = br.readLine())!=null){
                System.out.println("My Folder1: "+a);
                b = a.getBytes("UTF-8");
                bw.write(String.valueOf(b));
                System.out.println("My Folder2: "+b);
                log.log(Level.INFO, "Кодирование в UTF-8 прошло успешно");
            }
            br.close();
            bw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

