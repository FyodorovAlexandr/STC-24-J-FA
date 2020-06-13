package com.fyodorov.lesson13;

public enum Food {
    CARROT("Морковь",false),
    APPLE("Яблоко",true),
    PORRIDGE("Каша",false),
    PASTA("Макароны",true),
    SOUP("Суп",false),
    SWEETS("Конфеты",true);

    private String foodName;
    private boolean isTasty;

    Food(String foodName, boolean isTasty) {
        this.foodName = foodName;
        this.isTasty = isTasty;
    }

    public String getFoodName(Food food) {
        return foodName;
    }

    public boolean isTasty(Food food) {
        return isTasty;
    }
}