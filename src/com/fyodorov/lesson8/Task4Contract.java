package com.fyodorov.lesson8;

public class Task4Contract {
    public static void main(String[] args) {
        Act act = new Act();

        act.productList = "Товар ";
        act.number = "1 ";
        act.date = "5.04.2020 ";

        act.displayInfo();
        }
    }
    class Act{
     String productList;
     String number;
     String date;
        void displayInfo(){
            System.out.println("Акт: "+productList + number + date);
        }
    }