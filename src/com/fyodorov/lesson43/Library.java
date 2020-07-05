package com.fyodorov.lesson43;

import java.sql.*;
/**
 * Класс {@code Library} Написать программу “Библиотека” с использованием Базы Данных.
 * @author Alexandr Fyodorov
 */

public class Library {
    static final String jdbc_driver = "org.postgresql.Driver";
    static final String db_uri = "jdbc:postgresql://127.0.0.1:5432/Library";

    static final String user = "postgres";
    static final String password = "Kommers1403";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection connect = null;
        Statement stat = null;

        System.out.println("Registring driver...");
        Class.forName(jdbc_driver);

        System.out.println("Connection...");
        connect = DriverManager.getConnection(db_uri, user, password);

        System.out.println("Creating statement...");
        stat = connect.createStatement();

        String sql_q = "SELECT * FROM books ORDER BY author";

        boolean b = stat.execute(sql_q);
        System.out.println("Is data retrieved: " + b);

        System.out.println("Displaying books data:");
        ResultSet rs = stat.executeQuery(sql_q);

        while (rs.next()) {
            int id = rs.getInt("id");
            String bt = rs.getString("book_title");
            String a = rs.getString("author");
            int qb = rs.getInt("quantity_book");

            System.out.printf("id: %d, book_title: %s, author: %s, quantity_book: %d\n", id, bt, a, qb);
        }

        try {
            rs.close();
            stat.close();
            connect.close();
        }
        finally {
            if (stat != null)
                stat.close();
            if (connect != null)
                connect.close();
        }


        Connection connect2 = null;
        Statement stat2 = null;

        System.out.println();
        System.out.println("Registring driver...");
        Class.forName(jdbc_driver);

        System.out.println("Connection...");
        connect2 = DriverManager.getConnection(db_uri, user, password);

        System.out.println("Creating statement...");
        stat2 = connect2.createStatement();

        String sql_q2 = "SELECT * FROM readers ORDER BY last_name";

        boolean b2 = stat2.execute(sql_q2);
        System.out.println("Is data retrieved: " + b2);

        System.out.println("Displaying readers data:");
        ResultSet rs2 = stat2.executeQuery(sql_q2);

        while (rs2.next()) {
            int id = rs2.getInt("id");
            String fn = rs2.getString("first_name");
            String ln = rs2.getString("last_name");

            System.out.printf("id: %d, first_name: %s, last_name: %s\n", id, fn, ln);
        }

        try {
            rs2.close();
            stat2.close();
            connect2.close();
        }
        finally {
            if (stat2 != null)
                stat2.close();
            if (connect2 != null)
                connect2.close();
        }
    }
}