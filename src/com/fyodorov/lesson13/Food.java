package com.fyodorov.lesson13;

public enum Food {
    МОРКОВЬ(1),
    ЯБЛОКО(2),
    КАША(3);

    public int number;
    Food(int inputNumber) {number = inputNumber;}

    public Food getFoodByNumber(int number){
        if(number==1)
            return МОРКОВЬ;
        else if (number==2)
            return ЯБЛОКО;
        else
            return КАША;
    }
}
