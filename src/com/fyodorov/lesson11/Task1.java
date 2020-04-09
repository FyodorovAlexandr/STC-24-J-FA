package com.fyodorov.lesson11;

public class Task1 {
    public static void main(String[] args) {
        String source = "В строке есть слово бяка. Слово бяка запрещено.";
        source = source.replaceAll("бяка", "-вырезано цензурой-");
        System.out.println(source);
    }
}
