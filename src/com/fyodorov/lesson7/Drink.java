package com.fyodorov.lesson7;

public enum Drink {

    PEPSI(50),
    COLA(60),
    SPRITE(70);


    public int price;

    Drink(int inputPrice) {
        price = inputPrice;
    }
}
