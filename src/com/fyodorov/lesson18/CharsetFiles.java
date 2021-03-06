package com.fyodorov.lesson18;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Класс работает с файлами, используя кодировки (Charset)
 */
public class CharsetFiles {

    public static boolean writeFileWithCharset(String fileName, String text, Charset charset) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] buffer = text.getBytes(charset);
            fos.write(buffer, 0, buffer.length);
            System.out.println("Файл создан " +fileName);
            return true;
        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
            return false;
        }
    }

    public static boolean readFileWithCharset(String fileName, Charset charset) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, fis.available());
            String text = new String(buffer, charset);
            System.out.println("Файл " +fileName+ " прочитан: " +text);
            return true;
        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
            return false;
        }
    }

    public static boolean copyFileWithCharsets(String fileName1, Charset charset1,
                                               String fileName2, Charset charset2) {
        try (FileInputStream fis = new FileInputStream(fileName1);
             FileOutputStream fos = new FileOutputStream(fileName2)) {
            byte[] buffer = new byte[fis.available()];
            while (fis.available() > 0) {
                fis.read(buffer);
                String s = new String(buffer, charset1);
                buffer = s.getBytes(charset2);
                fos.write(buffer);
            }
            System.out.println("Файл " +fileName1+ " с кодировкой " +charset1+ " успешно скопирован в " +fileName2+ " с кодировкой " +charset2);
            return true;
        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
            return false;
        }

    }
}
