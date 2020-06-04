package com.fyodorov.lesson6;

public class Duck extends Animal {

    public Duck(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice () {
        System.out.println(super.getName() + " крякает");
    }
}