package com.fyodorov.lesson15.task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс выполняет операции с файлами и папками
 */
public class FileUtility {

    public static boolean checkIfNameCorrect(String name) {
        Pattern pattern = Pattern.compile("(.+)?[><\\|\\?*/:\\\\\"](.+)?");
        Matcher matcher = pattern.matcher(name);
        return !matcher.find();
    }

    public static boolean createDirectory(String pathName) {
        File folder = new File(pathName);
        if (folder.exists() && folder.isDirectory()) {
            System.out.println("Папка " +pathName+ " уже существует");
            return true;
        }
        if (folder.mkdir()) {
            System.out.println("Папка " +pathName+ " создана");
            return true;
        } else {
            System.out.println("Папка " +pathName+ " не создана");
            return false;
        }
    }

    public static boolean createDirectories(String pathName) {
        try {
            File folder = new File(pathName);
            if (folder.exists() && folder.isDirectory()) {
                System.out.println("Папка " +pathName+ " уже существует");
                return true;
            }
            if (folder.mkdirs()) {
                System.out.println("Папка " +pathName+ " создана");
                return true;
            } else {
                System.out.println("Папка " +pathName+ " не создана");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return false;
    }

    public static boolean createFile(String fileName) {
        File file = new File(fileName);
        if (file.exists() && file.isFile()) {
            System.out.println("Файл " +file.getAbsolutePath()+ " уже существует");
            return true;
        }
        try {
            if (file.createNewFile()) {
                System.out.println("Файл " +file.getAbsolutePath()+ " создан");
                return true;
            } else {
                System.out.println("Файл " +file.getAbsolutePath()+ " не создан");
                return false;
            }
        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
        }
        return false;
    }

    public static boolean renameFolder(String pathName1, String pathName2) {
        File path1 = new File(pathName1);
        File path2 = new File(pathName2);
        if (!path1.exists()) {
            System.out.println("Папка " +pathName1+ " не существует");
            return false;
        }
        if (path2.exists() && path2.isDirectory()) {
            System.out.println("Папка " +pathName2+ " уже существует");
            return false;
        }
        if (path1.renameTo(path2)) {
            System.out.println("Папка " +pathName1+ " переименована в " +pathName2);
            return true;
        } else {
            System.out.println("Папка " +pathName1+ " не была переименована");
            return false;
        }
    }

    public static boolean renameFile(String fileName1, String fileName2) {
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        if (!file1.exists()) {
            System.out.println("Файл " +fileName1+ " не существует");
            return false;
        }
        if (file2.exists() && file2.isFile()) {
            System.out.println("Файл " +fileName2+ " уже существует");
            return false;
        }
        if (file1.renameTo(file2)) {
            System.out.println("Файл " +fileName1+ " переименован в " +fileName2);
            return true;
        } else {
            System.out.println("Файл " +fileName1+ " не был переименован");
            return false;
        }
    }

    public static boolean copyFile(String file, String path) throws IOException {
        File inputFile = new File(file);
        File outputFile = new File(path + File.separator + inputFile.getName());
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            if (copyFileWithStream(fis, fos)) {
                System.out.println("Файл " +file+ " скопирован в " +path);
                return true;
            }
        }
        return false;
    }

    public static boolean copyFileWithStream(InputStream is, OutputStream os) {
        int nLength;
        byte[] buf = new byte[8000];
        try {
            while (true) {
                nLength = is.read(buf);
                if (nLength < 0) {
                    break;
                }
                os.write(buf, 0, nLength);
            }
            is.close();
            os.close();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            return false;
        }
        return true;
    }

    public static boolean deleteFolder(String pathName) {
        File path = new File(pathName);
        if (!path.exists()) {
            System.out.println("Папка "+pathName+ " не существует");
            return false;
        }
        if (path.exists() && path.isDirectory()) {
            if (path.delete()) {
                System.out.println("Папка " +pathName+ " удалена");
                return true;
            } else {
                System.out.println("Папка " +pathName+ " не был удалена ");
                return false;
            }
        }
        return false;
    }

    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Файл " +fileName+ " не существует");
            return false;
        }
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("Файл " +fileName+ " удалён");
                return true;
            } else {
                System.out.println("Файл " +fileName+ " не был удалён");
                return false;
            }
        }
        return false;
    }
}