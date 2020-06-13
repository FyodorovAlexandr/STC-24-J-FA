package com.fyodorov.lesson13;

public class Child {
    public void tasteDish(Food food) throws ChildDissatisfiedException {
        if (!food.isTasty(food)) {
            throw new ChildDissatisfiedException(food.getFoodName(food) +
                    " - это невкусно! Но всеравно спасибо...");
        }

        System.out.println(food.getFoodName(food) + " - это очень вкусно! Спасибо огромное!!!");
    }
}