package com.fyodorov.lesson17;

import java.io.*;

/**
 * Класс сериализует и десериализует Library
 */
public class LibraryStorage {

    public void saveLibrary(Library library) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
            oos.writeObject(library);
            System.out.println("Библиотека сохранена в library.dat");
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода:");
            System.out.println(e.fillInStackTrace());
            System.out.println();
        }
    }

    public Library loadLibrary() {
        File file = new File("library.dat");
        if (file.exists() && file.isFile()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (Library) ois.readObject();
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода:");
                System.out.println(e.fillInStackTrace());
                System.out.println();
            } catch (ClassNotFoundException e) {
                System.out.println("Не найден считываемый класс:");
                System.out.println(e.fillInStackTrace());
                System.out.println();
            }
        } else {
            System.out.println("Файл сохранения library.dat не найден. Восстановление невозможно");
            System.out.println();
        }
        return null;
    }
}